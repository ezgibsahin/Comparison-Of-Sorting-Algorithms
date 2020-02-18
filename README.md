# Comparison-Of-Sorting-Algorithms

Implementation and testing three sorting algorithms: Merge Sort, Quick Sort, and Heap Sort. You are expected to compare each sorting algorithm according to the computing time (in milliseconds) for different inputs(1000, 10000,100000). You must also create the arrays yourself according to the specified rules (1000, 10000, 100000 of each equal, random, increasing and decreasing order).

In the mergeSort method, there are two different ways of choosing number of partitions (numberOfPartitions).\
● TwoParts: recursively split the array into 2 parts\
● ThreeParts: recursively split the array into 3 parts

In the quickSort method, there are three different ways of choosing the pivot (pivotType) as given below.\
● FirstElement: The pivot is always the first element of the array to be sorted.\
● RandomElement: The pivot is chosen at random from any element in the array to be sorted.\
● MidOfFirstMidLastElement : The pivot is chosen to be the element whose value is in the middle among the {first, middle, and Last} elements in the array to be sorted.
