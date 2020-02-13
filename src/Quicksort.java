public class Quicksort {
	
	//http://www.cs.armstrong.edu/liang/intro9e/html/QuickSort.html   First
	//https://jordanspencerwu.github.io/randomized-quick-sort/        Random
	//http://www.algolist.net/Algorithms/Sorting/Quicksort            Middle
	public void quicksort(int[] A,String pivot)
	{
		if(pivot.equals("first")) 
		{
			sortFirst(A,0,A.length-1);
		}
		else if(pivot.equals("random"))
		{
			sortRandom(A,0,A.length-1);
		}
		else
		{
			sortMiddle(A,0,A.length-1);
		}
	}
	
	
	private void sortFirst(int[] A, int first, int last) 
	{
		    if (last > first) 
		    {
		      int q = partitionFirst(A, first, last);
		      sortFirst(A, first, q - 1);
		      sortFirst(A, q + 1, last);
		    }
	 }
	private int partitionFirst(int[] A, int first, int last)
	  {
		  int x = A[first]; 
		    int low = first + 1; 
		    int high = last;

		    while (high > low) 
		    {
		      while (low <= high && A[low] <= x)
		      {
		    	  low++;
		      }

		      while (low <= high && A[high] > x)
		      {
		    	  high--;
		      }
		      
		      if (high > low) 
		      {
		        int temp = A[high];
		        A[high] = A[low];
		        A[low] = temp;
		      }
		    }

		    while (high > first && A[high] >= x)
		    {
		    	high--;
		    }
		    
		    if (x > A[high]) 
		    {
		      A[first] = A[high];
		      A[high] = x;
		      return high;
		    }
		    else 
		    {
		      return first;
		    } 
	  }
	  
	private int partitionRandom(int[] A,int first,int last)
	{
		int pivot = A[last];
		int q = first;
		
		for(int i = first ;i<last;i++)
		{
			if(A[i] <= pivot)
			{
				int temp = A[q];
				A[q] = A[i];
				A[i] = temp;
				q = q+1;
			}	
		}
		int temp = A[q];
		A[q] = A[last];
		A[last] = temp;	
		return q;	
	}
	
	private int randomizedPartition(int[] A,int first,int last)
	{
		int x = (int) (Math.random() * (last-first + 1) + first);
		int temp = A[last];
		A[last] = A[x];
		A[x] = temp;	
		return partitionRandom(A,first,last);
	}
	
	private void sortRandom(int[] A,int first,int last)
	{
		if(first < last)
		{
			int randomPivot = randomizedPartition(A,first,last);
			sortRandom(A,first,randomPivot - 1);
			sortRandom(A,randomPivot+1,last);
		}
	}
	
	private int partitionMiddle(int[] A,int left,int right)
	{
		int i = left;
		int j = right;
		int x = A[(left + right) / 2];
		
		while(i<=j)
		{
			while(A[i] < x)
			{
				i++;
			}
			while(A[j] > x)
			{
				j--;
			}
			if(i<=j)
			{
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	private void sortMiddle(int[] A,int left,int right)
	{
		int k = partitionMiddle(A,left,right);
		if(left < k-1)
		{
			sortMiddle(A,left,k-1);
		}		
		if(k < right) 
		{
			sortMiddle(A,k,right);
		}
	}
	
}
