CountingSortJava
================

Counting Sort implemented in Java for the task: "accepts an array of integers N, where each value in the array 
is between 0 and length(N) - 1, and returns a new array with these values sorted."

Since, the sort is for integer numbers and the range of possible integer values in the array is below the length
of the array itself, the Counting Sort algorithm is probably one of the fastest as implemented in this example.

Worst case complexity of this algo is O(max(K,N)) where K is the max in the range and N is the length of the
array to be sorted. 

Since, by definition K < length(N), the worst case complexity is O(N).
