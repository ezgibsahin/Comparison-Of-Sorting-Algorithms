public class Test {
	public static void main(String[] args) {

		Heapsort hs = new Heapsort();
		Mergesort ms = new Mergesort();
		Quicksort qs = new Quicksort();
		
		int[] equal1 = new int[1000];
		int[] equal2 = new int[10000];
		int[] equal3 = new int[100000];
		
		int[] random1 = new int[1000];
		int[] random2 = new int[10000];
		int[] random3 = new int[100000];
		
		int[] increasing1 = new int[1000];
		int[] increasing2 = new int[10000];
		int[] increasing3 = new int[100000];
		
		int[] decreasing1 = new int[1000];
		int[] decreasing2 = new int[10000];
		int[] decreasing3 = new int[100000];
	
	
		int x = (int)(Math.random() * 13  +1);
		for(int i = 0;i<equal1.length;i++)
		{
			equal1[i] = x;
		}
	
		long startTime_equal1_heap = System.nanoTime();    
		hs.sort(equal1,equal1.length);
	    long stopTime_equal1_heap= System.nanoTime();    
        long elapsedTime_equal1_heap = stopTime_equal1_heap - startTime_equal1_heap;
	    System.out.println("Equal1 Heap = " + elapsedTime_equal1_heap);
	   
		
	    long startTime_equal1_merge2 = System.nanoTime();    
		ms.mergesort(equal1, "Two");
	    long stopTime_equal1_merge2= System.nanoTime();    
        long elapsedTime_equal1_merge2 = stopTime_equal1_merge2 - startTime_equal1_merge2;
	    System.out.println("Equal1 Merge2 = " + elapsedTime_equal1_merge2);
	    
	    long startTime_equal1_merge3 = System.nanoTime();    
		ms.mergesort(equal1, "Three");
	    long stopTime_equal1_merge3= System.nanoTime();    
        long elapsedTime_equal1_merge3 = stopTime_equal1_merge3 - startTime_equal1_merge3;
	    System.out.println("Equal1 Merge3 = " + elapsedTime_equal1_merge3);
	    
	    long startTime_equal1_first = System.nanoTime();    
		qs.quicksort(equal1, "first");
	    long stopTime_equal1_first= System.nanoTime();    
        long elapsedTime_equal1_first = stopTime_equal1_first - startTime_equal1_first;
	    System.out.println("Equal1 First Pivot = " + elapsedTime_equal1_first);
	    
	    long startTime_equal1_random= System.nanoTime();    
		qs.quicksort(equal1, "random");
	    long stopTime_equal1_random= System.nanoTime();    
        long elapsedTime_equal1_random = stopTime_equal1_random - startTime_equal1_random;
	    System.out.println("Equal1 Random Pivot = " + elapsedTime_equal1_random);
	 
	    long startTime_equal1_middle= System.nanoTime();    
		qs.quicksort(equal1, "middle");
	    long stopTime_equal1_middle= System.nanoTime();    
        long elapsedTime_equal1_middle = stopTime_equal1_middle - startTime_equal1_middle;
	    System.out.println("Equal1 Middle Pivot = " + elapsedTime_equal1_middle);
		
		for(int i = 0;i<equal2.length;i++)
		{
			equal2[i] = x;
		}
		
		long startTime_equal2_heap = System.nanoTime();
		hs.sort(equal2,equal2.length);
	    long stopTime_equal2_heap= System.nanoTime();
        long elapsedTime_equal2_heap = stopTime_equal2_heap - startTime_equal2_heap;
	    System.out.println("Equal2 Heap = " + elapsedTime_equal2_heap);
	    
	    
	    long startTime_equal2_merge2 = System.nanoTime();    
		ms.mergesort(equal2, "Two");
	    long stopTime_equal2_merge2= System.nanoTime();    
        long elapsedTime_equal2_merge2 = stopTime_equal2_merge2 - startTime_equal2_merge2;
	    System.out.println("Equal2 Merge2 = " + elapsedTime_equal2_merge2);
	    
	    
	    long startTime_equal2_merge3 = System.nanoTime();    
		ms.mergesort(equal2, "Three");
	    long stopTime_equal2_merge3= System.nanoTime();    
        long elapsedTime_equal2_merge3 = stopTime_equal2_merge3 - startTime_equal2_merge3;
	    System.out.println("Equal2 Merge3 = " + elapsedTime_equal2_merge3);
	    
	    
	    long startTime_equal2_first = System.nanoTime();    
		qs.quicksort(equal2, "first");
	    long stopTime_equal2_first= System.nanoTime();    
        long elapsedTime_equal2_first = stopTime_equal2_first - startTime_equal2_first;
	    System.out.println("Equal2 First Pivot = " + elapsedTime_equal2_first);
	    
	    long startTime_equal2_random= System.nanoTime();    
		qs.quicksort(equal2, "random");
	    long stopTime_equal2_random= System.nanoTime();    
        long elapsedTime_equal2_random = stopTime_equal2_random - startTime_equal2_random;
	    System.out.println("Equal2 Random Pivot = " + elapsedTime_equal2_random);
	    
	    long startTime_equal2_middle= System.nanoTime();    
		qs.quicksort(equal2, "middle");
	    long stopTime_equal2_middle= System.nanoTime();    
        long elapsedTime_equal2_middle = stopTime_equal2_middle - startTime_equal2_middle;
	    System.out.println("Equal2 Middle Pivot = " + elapsedTime_equal2_middle);
	    
		for(int i = 0;i<equal3.length;i++)
		{
			equal3[i] = x;
		}
		
		long startTime_equal3_heap = System.nanoTime();
		hs.sort(equal3,equal3.length);
	    long stopTime_equal3_heap= System.nanoTime();
        long elapsedTime_equal3_heap = stopTime_equal3_heap - startTime_equal3_heap;
	    System.out.println("Equal3 Heap = " + elapsedTime_equal3_heap);
	    
	    long startTime_equal3_merge2 = System.nanoTime();    
		ms.mergesort(equal3, "Two");
	    long stopTime_equal3_merge2= System.nanoTime();    
        long elapsedTime_equal3_merge2 = stopTime_equal3_merge2 - startTime_equal3_merge2;
	    System.out.println("Equal3 Merge 2 = " +elapsedTime_equal3_merge2);
	    
	    long startTime_equal3_merge3 = System.nanoTime();    
		ms.mergesort(equal3, "Three");
	    long stopTime_equal3_merge3= System.nanoTime();    
        long elapsedTime_equal3_merge3 = stopTime_equal3_merge3 - startTime_equal3_merge3;
	    System.out.println("Equal3 Merge3 = " + elapsedTime_equal3_merge3);
	       
	    long startTime_equal3_first = System.nanoTime();    
		qs.quicksort(equal3, "first");
	    long stopTime_equal3_first= System.nanoTime();    
        long elapsedTime_equal3_first = stopTime_equal3_first - startTime_equal3_first;
	    System.out.println("Equal3 First Pivot = " + elapsedTime_equal3_first);
	    
	    long startTime_equal3_random= System.nanoTime();    
		qs.quicksort(equal3, "random");
	    long stopTime_equal3_random= System.nanoTime();    
        long elapsedTime_equal3_random = stopTime_equal3_random - startTime_equal3_random;
	    System.out.println("Equal3 Random Pivot = " + elapsedTime_equal3_random);
	    
	    long startTime_equal3_middle= System.nanoTime();    
		qs.quicksort(equal3, "middle");
	    long stopTime_equal3_middle= System.nanoTime();    
        long elapsedTime_equal3_middle = stopTime_equal3_middle - startTime_equal3_middle;
	    System.out.println("Equal3 Middle Pivot = " + elapsedTime_equal3_middle);
	    /*
	    
		for(int i = 0;i<random1.length;i++)
		{
			int random = (int) (Math.random() * 1000 +1);
			random1[i] = random;		
		}
		
		
		long startTime_random1_heap = System.nanoTime();
		hs.sort(random1,random1.length);
	    long stopTime_random1_heap= System.nanoTime();
        long elapsedTime_random1_heap = stopTime_random1_heap - startTime_random1_heap;
	    System.out.println("Random1 Heap = " + elapsedTime_random1_heap);
	    
	    long startTime_random1_merge2 = System.nanoTime();    
		ms.mergesort(random1, "Two");
	    long stopTime_random1_merge2= System.nanoTime();    
        long elapsedTime_random1_merge2 = stopTime_random1_merge2 - startTime_random1_merge2;
	    System.out.println("Random1 Merge2 = " + elapsedTime_random1_merge2);
	    
	    long startTime_random1_merge3 = System.nanoTime();    
		ms.mergesort(random1, "Three");
	    long stopTime_random1_merge3= System.nanoTime();    
        long elapsedTime_random1_merge3 = stopTime_random1_merge3 - startTime_random1_merge3;
	    System.out.println("Random1 Merge3 = " + elapsedTime_random1_merge3);
	    
	    long startTime_random1_first = System.nanoTime();    
		qs.quicksort(random1, "first");
	    long stopTime_random1_first= System.nanoTime();    
        long elapsedTime_random1_first = stopTime_random1_first - startTime_random1_first;
	    System.out.println("Random1 First Pivot = " + elapsedTime_random1_first);
	    
	    long startTime_random1_random= System.nanoTime();    
		qs.quicksort(random1, "random");
	    long stopTime_random1_random= System.nanoTime();    
        long elapsedTime_random1_random = stopTime_random1_random - startTime_random1_random;
	    System.out.println("Random1 Random Pivot = " + elapsedTime_random1_random);
	    
	    long startTime_random1_middle= System.nanoTime();    
		qs.quicksort(random1, "middle");
	    long stopTime_random1_middle= System.nanoTime();    
        long elapsedTime_random1_middle = stopTime_random1_middle - startTime_random1_middle;
	    System.out.println("Random1 Middle Pivot = " + elapsedTime_random1_middle);
		
		for(int i = 0;i<random2.length;i++)
		{
			int random = (int) (Math.random() * 1000 +1);
			random2[i] = random;		
		}
		
		long startTime_random2_heap = System.nanoTime();
		hs.sort(random2,random2.length);
	    long stopTime_random2_heap= System.nanoTime();
        long elapsedTime_random2_heap = stopTime_random2_heap - startTime_random2_heap;
	    System.out.println("Random2 Heap = " + elapsedTime_random2_heap);
	    
	    long startTime_random2_merge2 = System.nanoTime();    
		ms.mergesort(random2, "Two");
	    long stopTime_random2_merge2= System.nanoTime();    
        long elapsedTime_random2_merge2 = stopTime_random2_merge2 - startTime_random2_merge2;
	    System.out.println("Random2 Merge2 = " + elapsedTime_random2_merge2);
	    
	    long startTime_random2_merge3 = System.nanoTime();    
		ms.mergesort(random2, "Three");
	    long stopTime_random2_merge3= System.nanoTime();    
        long elapsedTime_random2_merge3 = stopTime_random2_merge3 - startTime_random2_merge3;
	    System.out.println("Random2 Merge3 = " + elapsedTime_random2_merge3);
	    
	    long startTime_random2_first = System.nanoTime();    
		qs.quicksort(random2, "first");
	    long stopTime_random2_first= System.nanoTime();    
        long elapsedTime_random2_first = stopTime_random2_first - startTime_random2_first;
	    System.out.println("Random2 First Pivot = " + elapsedTime_random2_first);
	    
	    long startTime_random2_random= System.nanoTime();    
		qs.quicksort(random2, "random");
	    long stopTime_random2_random= System.nanoTime();    
        long elapsedTime_random2_random = stopTime_random2_random - startTime_random2_random;
	    System.out.println("Random2 Random Pivot = " + elapsedTime_random2_random);
	    
	    long startTime_random2_middle= System.nanoTime();    
		qs.quicksort(random2, "middle");
	    long stopTime_random2_middle= System.nanoTime();    
        long elapsedTime_random2_middle = stopTime_random2_middle - startTime_random2_middle;
	    System.out.println("Random2 Middle Pivot = " + elapsedTime_random2_middle);
		
		for(int i = 0;i<random3.length;i++)
		{
			int random = (int) (Math.random() * 1000 +1);
			random3[i] = random;		
		}
		
		long startTime_random3_heap = System.nanoTime();
		hs.sort(random3,random3.length);
	    long stopTime_random3_heap= System.nanoTime();
        long elapsedTime_random3_heap = stopTime_random3_heap - startTime_random3_heap;
	    System.out.println("Random3 Heap = " + elapsedTime_random3_heap);
	    
	    long startTime_random3_merge2 = System.nanoTime();    
		ms.mergesort(random3, "Two");
	    long stopTime_random3_merge2= System.nanoTime();    
        long elapsedTime_random3_merge2 = stopTime_random3_merge2 - startTime_random3_merge2;
	    System.out.println("Random3 Merge2 = " + elapsedTime_random3_merge2);
	    
	    long startTime_random3_merge3 = System.nanoTime();    
		ms.mergesort(random3, "Three");
	    long stopTime_random3_merge3= System.nanoTime();    
        long elapsedTime_random3_merge3 = stopTime_random3_merge3 - startTime_random3_merge3;
	    System.out.println("Random3 Merge3 = " + elapsedTime_random3_merge3);
	    
	    long startTime_random3_first = System.nanoTime();    
		qs.quicksort(random3, "first");
	    long stopTime_random3_first= System.nanoTime();    
        long elapsedTime_random3_first = stopTime_random3_first - startTime_random3_first;
	    System.out.println("Random3 First Pivot = " + elapsedTime_random3_first);
	    
	    long startTime_random3_random= System.nanoTime();    
		qs.quicksort(random3, "random");
	    long stopTime_random3_random= System.nanoTime();    
        long elapsedTime_random3_random = stopTime_random3_random - startTime_random3_random;
	    System.out.println("Random3 Random Pivot = " + elapsedTime_random3_random);
	    
	    long startTime_random3_middle= System.nanoTime();    
		qs.quicksort(random3, "middle");
	    long stopTime_random3_middle= System.nanoTime();    
        long elapsedTime_random3_middle = stopTime_random3_middle - startTime_random3_middle;
	    System.out.println("Random3 Middle Pivot = " + elapsedTime_random3_middle);		
	    
		for(int i=0;i<increasing1.length;i++)
		{
			increasing1[i] = i;
		}
		
		long startTime_increasing1_heap = System.nanoTime();
		hs.sort(increasing1,increasing1.length);
	    long stopTime_increasing1_heap= System.nanoTime();
        long elapsedTime_increasing1_heap = stopTime_increasing1_heap - startTime_increasing1_heap;
	    System.out.println("Increasing1 Heap = " + elapsedTime_increasing1_heap);
	    
	    long startTime_increasing1_merge2 = System.nanoTime();    
		ms.mergesort(increasing1, "Two");
	    long stopTime_increasing1_merge2= System.nanoTime();    
        long elapsedTime_increasing1_merge2 = stopTime_increasing1_merge2 - startTime_increasing1_merge2;
	    System.out.println("Increasing1 Merge2 = " + elapsedTime_increasing1_merge2);
	    
	    long startTime_increasing1_merge3 = System.nanoTime();    
		ms.mergesort(increasing1, "Three");
	    long stopTime_increasing1_merge3= System.nanoTime();    
        long elapsedTime_increasing1_merge3 = stopTime_increasing1_merge3 - startTime_increasing1_merge3;
	    System.out.println("Increasing1 Merge3 = " + elapsedTime_increasing1_merge3);
	    
	    long startTime_increasing1_first = System.nanoTime();    
		qs.quicksort(increasing1, "first");
	    long stopTime_increasing1_first= System.nanoTime();    
        long elapsedTime_increasing1_first = stopTime_increasing1_first - startTime_increasing1_first;
	    System.out.println("Increasing1 First Pivot = " + elapsedTime_increasing1_first);
	    
	    long startTime_increasing1_random= System.nanoTime();    
		qs.quicksort(increasing1, "random");
	    long stopTime_increasing1_random= System.nanoTime();    
        long elapsedTime_increasing1_random = stopTime_increasing1_random - startTime_increasing1_random;
	    System.out.println("Increasing1 Random Pivot = " + elapsedTime_increasing1_random);
	    
	    long startTime_increasing1_middle= System.nanoTime();    
		qs.quicksort(increasing1, "middle");
	    long stopTime_increasing1_middle= System.nanoTime();    
        long elapsedTime_increasing1_middle = stopTime_increasing1_middle - startTime_increasing1_middle;
	    System.out.println("Increasing1 Middle Pivot = " + elapsedTime_increasing1_middle);		
	    
		for(int i=0;i<increasing2.length;i++)
		{
			increasing2[i] = i;
		}
		
		long startTime_increasing2_heap = System.nanoTime();
		hs.sort(increasing2,increasing2.length);
	    long stopTime_increasing2_heap= System.nanoTime();
        long elapsedTime_increasing2_heap = stopTime_increasing2_heap - startTime_increasing2_heap;
	    System.out.println("Increasing2 Heap = " + elapsedTime_increasing2_heap);
	    
	    long startTime_increasing2_merge2 = System.nanoTime();    
		ms.mergesort(increasing2, "Two");
	    long stopTime_increasing2_merge2= System.nanoTime();    
        long elapsedTime_increasing2_merge2 = stopTime_increasing2_merge2 - startTime_increasing2_merge2;
	    System.out.println("Increasing2 Merge2 = " + elapsedTime_increasing2_merge2);
	    
	    long startTime_increasing2_merge3 = System.nanoTime();    
		ms.mergesort(increasing2, "Three");
	    long stopTime_increasing2_merge3= System.nanoTime();    
        long elapsedTime_increasing2_merge3 = stopTime_increasing2_merge3 - startTime_increasing2_merge3;
	    System.out.println("Increasing2 Merge3 = " + elapsedTime_increasing2_merge3);
	    
	    long startTime_increasing2_first = System.nanoTime();    
		qs.quicksort(increasing2, "first");
	    long stopTime_increasing2_first= System.nanoTime();    
        long elapsedTime_increasing2_first = stopTime_increasing2_first - startTime_increasing2_first;
	    System.out.println("Increasing2 First Pivot = " + elapsedTime_increasing2_first);
	    
	    long startTime_increasing2_random= System.nanoTime();    
		qs.quicksort(increasing2, "random");
	    long stopTime_increasing2_random= System.nanoTime();    
        long elapsedTime_increasing2_random = stopTime_increasing2_random - startTime_increasing2_random;
	    System.out.println("Increasing2 Random Pivot = " + elapsedTime_increasing2_random);
	    
	    long startTime_increasing2_middle= System.nanoTime();    
		qs.quicksort(increasing2, "middle");
	    long stopTime_increasing2_middle= System.nanoTime();    
        long elapsedTime_increasing2_middle = stopTime_increasing2_middle - startTime_increasing2_middle;
	    System.out.println("Increasing2 Middle Pivot = " + elapsedTime_increasing2_middle);		
	    
		for(int i=0;i<increasing3.length;i++)
		{
			increasing3[i] = i;
		}
		
		long startTime_increasing3_heap = System.nanoTime();
		hs.sort(increasing3,increasing3.length);
	    long stopTime_increasing3_heap= System.nanoTime();
        long elapsedTime_increasing3_heap = stopTime_increasing3_heap - startTime_increasing3_heap;
	    System.out.println("Increasing3 Heap = " + elapsedTime_increasing3_heap);
	    
	    long startTime_increasing3_merge2 = System.nanoTime();    
		ms.mergesort(increasing3, "Two");
	    long stopTime_increasing3_merge2= System.nanoTime();    
        long elapsedTime_increasing3_merge2 = stopTime_increasing3_merge2 - startTime_increasing3_merge2;
	    System.out.println("Increasing3 Merge2 = " + elapsedTime_increasing3_merge2);
	    
	    long startTime_increasing3_merge3 = System.nanoTime();    
		ms.mergesort(increasing3, "Three");
	    long stopTime_increasing3_merge3= System.nanoTime();    
        long elapsedTime_increasing3_merge3 = stopTime_increasing3_merge3 - startTime_increasing3_merge3;
	    System.out.println("Increasing3 Merge3 = " + elapsedTime_increasing3_merge3);
	    
	    long startTime_increasing3_first = System.nanoTime();    
		qs.quicksort(increasing3, "first");
	    long stopTime_increasing3_first= System.nanoTime();    
        long elapsedTime_increasing3_first = stopTime_increasing3_first - startTime_increasing3_first;
	    System.out.println("Increasing3 First Pivot = " + elapsedTime_increasing3_first);
	    
	    long startTime_increasing3_random= System.nanoTime();    
		qs.quicksort(increasing3, "random");
	    long stopTime_increasing3_random= System.nanoTime();    
        long elapsedTime_increasing3_random = stopTime_increasing3_random - startTime_increasing3_random;
	    System.out.println("Increasing3 Random Pivot = " + elapsedTime_increasing3_random);
	    
	    long startTime_increasing3_middle= System.nanoTime();    
		qs.quicksort(increasing3, "middle");
	    long stopTime_increasing3_middle= System.nanoTime();    
        long elapsedTime_increasing3_middle = stopTime_increasing3_middle - startTime_increasing3_middle;
	    System.out.println("Increasing3 Middle Pivot = " + elapsedTime_increasing3_middle);	
		
		int n1 = decreasing1.length;
		for(int i = 0;i<decreasing1.length;i++)
		{
			decreasing1[i] = n1;
			n1--;
		}
		
		long startTime_decreasing1_heap = System.nanoTime();
		hs.sort(decreasing1,decreasing1.length);
	    long stopTime_decreasing1_heap= System.nanoTime();
        long elapsedTime_decreasing1_heap = stopTime_decreasing1_heap - startTime_decreasing1_heap;
	    System.out.println("Decreasing1 Heap = " + elapsedTime_decreasing1_heap);
	    
	    long startTime_decreasing1_merge2 = System.nanoTime();    
		ms.mergesort(decreasing1, "Two");
	    long stopTime_decreasing1_merge2= System.nanoTime();    
        long elapsedTime_decreasing1_merge2 = stopTime_decreasing1_merge2 - startTime_decreasing1_merge2;
	    System.out.println("Decreasing1 Merge2 = " + elapsedTime_decreasing1_merge2);
	    
	    long startTime_decreasing1_merge3 = System.nanoTime();    
		ms.mergesort(decreasing1, "Three");
	    long stopTime_decreasing1_merge3= System.nanoTime();    
        long elapsedTime_decreasing1_merge3 = stopTime_decreasing1_merge3 - startTime_decreasing1_merge3;
	    System.out.println("Decreasing1 Merge3 = " + elapsedTime_decreasing1_merge3);
	    
	    long startTime_decreasing1_first = System.nanoTime();    
		qs.quicksort(decreasing1, "first");
	    long stopTime_decreasing1_first= System.nanoTime();    
        long elapsedTime_decreasing1_first = stopTime_decreasing1_first - startTime_decreasing1_first;
	    System.out.println("Decreasing1 First Pivot = " + elapsedTime_decreasing1_first);
	    
	    long startTime_decreasing1_random= System.nanoTime();    
		qs.quicksort(decreasing1, "random");
	    long stopTime_decreasing1_random= System.nanoTime();    
        long elapsedTime_decreasing1_random = stopTime_decreasing1_random - startTime_decreasing1_random;
	    System.out.println("Decreasing1 Random Pivot = " + elapsedTime_decreasing1_random);
	    
	    long startTime_decreasing1_middle= System.nanoTime();    
		qs.quicksort(decreasing1, "middle");
	    long stopTime_decreasing1_middle= System.nanoTime();    
        long elapsedTime_decreasing1_middle = stopTime_decreasing1_middle - startTime_decreasing1_middle;
	    System.out.println("Decreasing1 Middle Pivot = " + elapsedTime_decreasing1_middle);	
		
		
		int n2 = decreasing2.length;
		for(int i = 0;i<decreasing2.length;i++)
		{
			decreasing2[i] = n2;
			n2--;
		}
		
		long startTime_decreasing2_heap = System.nanoTime();
		hs.sort(decreasing2,decreasing2.length);
	    long stopTime_decreasing2_heap= System.nanoTime();
        long elapsedTime_decreasing2_heap = stopTime_decreasing2_heap - startTime_decreasing2_heap;
	    System.out.println("Decreasing2 Heap = " + elapsedTime_decreasing2_heap);
	    
	    long startTime_decreasing2_merge2 = System.nanoTime();    
		ms.mergesort(decreasing2, "Two");
	    long stopTime_decreasing2_merge2= System.nanoTime();    
        long elapsedTime_decreasing2_merge2 = stopTime_decreasing2_merge2 - startTime_decreasing2_merge2;
	    System.out.println("Decreasing2 Merge2 = " + elapsedTime_decreasing2_merge2);
	    
	    long startTime_decreasing2_merge3 = System.nanoTime();    
		ms.mergesort(decreasing2, "Three");
	    long stopTime_decreasing2_merge3= System.nanoTime();    
        long elapsedTime_decreasing2_merge3 = stopTime_decreasing2_merge3 - startTime_decreasing2_merge3;
	    System.out.println("Decreasing2 Merge3 = " + elapsedTime_decreasing2_merge3);
	    
	    long startTime_decreasing2_first = System.nanoTime();    
		qs.quicksort(decreasing2, "first");
	    long stopTime_decreasing2_first= System.nanoTime();    
        long elapsedTime_decreasing2_first = stopTime_decreasing2_first - startTime_decreasing2_first;
	    System.out.println("Decreasing2 First Pivot = " + elapsedTime_decreasing2_first);
	    
	    long startTime_decreasing2_random= System.nanoTime();    
		qs.quicksort(decreasing2, "random");
	    long stopTime_decreasing2_random= System.nanoTime();    
        long elapsedTime_decreasing2_random = stopTime_decreasing2_random - startTime_decreasing2_random;
	    System.out.println("Decreasing2 Random Pivot = " + elapsedTime_decreasing2_random);
	    
	    long startTime_decreasing2_middle= System.nanoTime();    
		qs.quicksort(decreasing2, "middle");
	    long stopTime_decreasing2_middle= System.nanoTime();    
        long elapsedTime_decreasing2_middle = stopTime_decreasing2_middle - startTime_decreasing2_middle;
	    System.out.println("Decreasing2 Middle Pivot = " + elapsedTime_decreasing2_middle);	
		
		int n3 = decreasing3.length;
		for(int i = 0;i<decreasing3.length;i++)
		{
			decreasing3[i] = n3;
			n3--;
		}
		
		long startTime_decreasing3_heap = System.nanoTime();
		hs.sort(decreasing3,decreasing3.length);
	    long stopTime_decreasing3_heap= System.nanoTime();
        long elapsedTime_decreasing3_heap = stopTime_decreasing3_heap - startTime_decreasing3_heap;
	    System.out.println("Decreasing3 Heap = " + elapsedTime_decreasing3_heap);
	    
	    long startTime_decreasing3_merge2 = System.nanoTime();    
		ms.mergesort(decreasing3, "Two");
	    long stopTime_decreasing3_merge2= System.nanoTime();    
        long elapsedTime_decreasing3_merge2 = stopTime_decreasing3_merge2 - startTime_decreasing3_merge2;
	    System.out.println("Decreasing3 Merge2 = " + elapsedTime_decreasing3_merge2);
	    
	    long startTime_decreasing3_merge3 = System.nanoTime();    
		ms.mergesort(decreasing3, "Three");
	    long stopTime_decreasing3_merge3= System.nanoTime();    
        long elapsedTime_decreasing3_merge3 = stopTime_decreasing3_merge3 - startTime_decreasing3_merge3;
	    System.out.println("Decreasing3 Merge3 = " + elapsedTime_decreasing3_merge3);
	    
	    long startTime_decreasing3_first = System.nanoTime();    
		qs.quicksort(decreasing3, "first");
	    long stopTime_decreasing3_first= System.nanoTime();    
        long elapsedTime_decreasing3_first = stopTime_decreasing3_first - startTime_decreasing3_first;
	    System.out.println("Decreasing3 First Pivot = " + elapsedTime_decreasing3_first);
	    
	    long startTime_decreasing3_random= System.nanoTime();    
		qs.quicksort(decreasing3, "random");
	    long stopTime_decreasing3_random= System.nanoTime();    
        long elapsedTime_decreasing3_random = stopTime_decreasing3_random - startTime_decreasing3_random;
	    System.out.println("Decreasing3 Random Pivot = " + elapsedTime_decreasing3_random);
	    
	    long startTime_decreasing3_middle= System.nanoTime();    
		qs.quicksort(decreasing3, "middle");
	    long stopTime_decreasing3_middle= System.nanoTime();    
        long elapsedTime_decreasing3_middle = stopTime_decreasing3_middle - startTime_decreasing3_middle;
	    System.out.println("Decreasing3 Middle Pivot = " + elapsedTime_decreasing3_middle);	
	   */
	}
}
