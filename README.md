# SEARCHING-ALGORITHMS

This repo provides an overview of  Searching Algorithms. 
Searching algorithms are techniques for finding specific elements within a collection of data. They are fundamental in computer science and are used in various applications such as databases, search engines etc. 

1. Linear Search
 Checks each element in the list sequentially until the desired element is found or the list ends.
- Time Complexity: O(n), n = no. of elements in the list.
-Application: Simple and works well for small or unsorted lists.

2. Binary Search
 Divides the sorted list into halves to check the middle element and determines if the target is in the left or right half, repeatedly, that is, the process is recursive.

-Time Complexity: O(log n),  n = no. of elements in the list.
-Application: Efficient for large, sorted lists.

3. Interpolation Search
 Improves on binary search for uniformly distributed data by estimating the position of the target value.
-Time Complexity: O(log log n) for uniformly distributed data, O(n) in the worst case.
-Application: Best for large, uniformly distributed datasets.

4. Exponential Search
 Finds the range where the target may be, then performs binary search within that range.
Time Complexity: O(log n).
-Application: Useful when the element's location in the list is not known and the list is sorted.
These algorithms are chosen based on the specific requirements and constraints of the problem, such as the size and ordering of the dataset. Understanding their characteristics and complexities helps in selecting the most efficient one for a given task.
