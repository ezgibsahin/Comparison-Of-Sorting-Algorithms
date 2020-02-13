public class Mergesort {

	//https://www.geeksforgeeks.org/3-way-merge-sort/       Mergesort 3 Parts
	
	public void mergesort(int[] A,String parts)
	{
		if(parts.equals("Two"))
		{			
			sort2(A,0,A.length-1);
		}
		else
		{		
			mergeSort3Way(A);
		}
	}
	
	private void merge2(int[] A,int p,int q,int r)
	{
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i]= A[p+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			R[j] = A[q+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = p;
		
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				A[k] = L[i];
				i++;
			}
			else
			{
				A[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			A[k] = R[j];
			j++;
			k++;
		}
	}
	
	private void sort2(int[] A,int p,int r)
	{
		if(p<r)
		{
			int q = (p+r) / 2 ;
			sort2(A,p,q);
			sort2(A,q+1,r);
			merge2(A,p,q,r);
		}
	}
	
	private static void mergeSort3Way(int[] A)
    {  	
        if (A == null)  return;
        
        int[] temp = new int[A.length];
 
        for (int i = 0; i < temp.length; i++)
        {     	
        	temp[i] = A[i];
        }
        
        mergeSort3WayRec(temp, 0, A.length, A);
 
        for (int i = 0; i < temp.length; i++)
        {
        	 A[i] = temp[i];
        }     
    }
 
    private static void mergeSort3WayRec(int[] A,int low, int high, int[] destArray)
    {
        if (high - low < 2) return;

        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;
        
        mergeSort3WayRec(destArray, low, mid1, A);
        mergeSort3WayRec(destArray, mid1, mid2, A);
        mergeSort3WayRec(destArray, mid2, high, A);
        merge3(destArray, low, mid1, mid2, high, A);
    }
 
    private static void merge3(int[] A, int low,int mid1, int mid2, int high,int[] destArray)
    {
        int i = low, j = mid1, k = mid2, l = low;
        while ((i < mid1) && (j < mid2) && (k < high))
        {
            if (((Integer) A[i]).compareTo((Integer) A[j])  < 0)
            {
                if (((Integer) A[i]).compareTo((Integer) A[k]) < 0) destArray[l++] = A[i++];
                else destArray[l++] = A[k++];
            }
            else
            {
                if (((Integer) A[j]).compareTo((Integer) A[k]) < 0) destArray[l++] = A[j++];             
                else  destArray[l++] = A[k++];
            }
        }
 
        while ((i < mid1) && (j < mid2))
        {
            if (((Integer) A[i]).compareTo((Integer) A[j])< 0) destArray[l++] = A[i++];             
            else  destArray[l++] = A[j++];               
        }

        while ((j < mid2) && (k < high))
        {
            if (((Integer) A[j]).compareTo((Integer) A[k]) < 0)  destArray[l++] = A[j++];
            else destArray[l++] = A[k++];         
        }

        while ((i < mid1) && (k < high))
        {
            if (((Integer) A[i]).compareTo((Integer) A[k]) < 0) destArray[l++] = A[i++];            
            else  destArray[l++] = A[k++];       
        }
    
        while (i < mid1)
        {
        	destArray[l++] = A[i++];
        }
             
        while (j < mid2)
        {
        	 destArray[l++] = A[j++];
        }
                 
        while (k < high)
        {
        	 destArray[l++] = A[k++];
        }         
    }
    
    
}
