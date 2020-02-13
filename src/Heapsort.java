public class Heapsort {

	public void maxHeapify(int [] A,int i,int n)
	{
		int l = 2*i + 1 ;
		int r = 2*i + 2;
		int largest = i;
		
		if(l < n && A[l] > A[largest])
		{
			largest = l;
		}
		else largest = i;
		
		if(r < n && A[r] > A[largest])
		{
			largest = r;
		}
		
		if(largest != i)
		{
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			maxHeapify(A,largest,n);
		}	
	}
	 
	public void buildMaxHeap(int[] A,int n)
	{
		for(int i = (n/2 )- 1 ; i>=0;i--)
		{
			maxHeapify(A,i,n);
		}
	}
	 
    public void sort(int[] A,int n)
	{
		buildMaxHeap(A,n);
		n = A.length;
		for (int i=n-1; i>=0; i--)
		{
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			maxHeapify(A,0,i);
		}
	}
	
    static void print(int[] A)
    {
        for (int i=0; i<A.length;i++)
        {
        	System.out.print(A[i] + " ");
        }
    }  
    
}
