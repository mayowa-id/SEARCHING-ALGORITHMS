# SEARCHING-ALGORITHMS

This repo provides an overview of  Searching Algorithms. 
Searching algorithms are techniques for finding specific elements within a collection of data. They are fundamental in computer science and are used in various applications such as databases, search engines etc. 

This readme gives an outlook on searching algorithms in general but the codebase however only has three search algorithms implemented in it - Linear search, Binary search, Exponential search

1. Linear Search
Linear search is a straightforward search algorithm that checks each element of the list sequentially until the desired element is found or the list ends, after we find the target integer we can use the swap algo to pluck it out.

Basically the following are the steps involved in the logic behind implementting linear search. 
i. Start comparison (var i=0 in the loop) from the first element.
ii. Compare the current element with the target element.
iii. If the current element matches the target, return the index.
If not, move to the next element and repeat steps 2-3.
If the end of the list is reached and the target is not found, return -1.
Time Complexity
Best Case: O(1) (if the target is the first element).
Average Case: O(n) (where n is the number of elements).
Worst Case: O(n) (if the target is the last element or not present).
- Application
Simple and effective for small or unsorted lists.
No preprocessing of the list is required.

2. Binary Search
Binary search is an efficient algorithm for finding an element in a sorted array by repeatedly dividing the search interval in half. It leverages the sorted property of the array to reduce the search space significantly.
How it works is simple, we start with two pointers, low at the beginning of the array and high at the end of the array.



3. Exponential Search
Exponential search is an algorithm for searching in a sorted array that combines binary search with an exponential growth step to find the range where the target may lie.
The following steps show how the algorithm works
-Start with the first element.
-Check if the first element matches the target, If not, move to the element at index 2^1 (2), 2^2 (4), 2^3 (8), and so on, until an element greater than the target is found or the end of the array is reached.
Once the range [2^(k-1), 2^k] is identified where the target lies, perform a binary search within this range.
-Time Complexity
Best Case: O(1) (if the target is the first element).
Average and Worst Case: O(log n) for the exponential step plus O(log n) for the binary search, leading to O(log n) overall.
Appliation
Efficient for large, sorted arrays where binary search alone may not be optimal.
Particularly useful when the position of the target element is not known and the array is unbounded (or very large).

4. Ternary Search
Ternary search is an extension of binary search that divides the array into three parts instead of two. It is used for finding the maximum or minimum of a unimodal function or for searching in a sorted array.
The following steps are followed to implement Ternary search (The ;ogic behind the imnplementation)
i. Divide the array into three parts by two mid points: mid1 and mid2.
ii. Compare the key with the elements at mid1 and mid2.
iii. Depending on the comparison, narrow the search based on the following conditions:
- If the key is less than the element at mid1, search in the left third.
- If the key is greater than the element at mid2, search in the right third.
- If the key is between mid1 and mid2, search in the middle third.
Repeat the process until the key is found or the search space is empty.

  Time Complexity
Best and Average Case: O(log3 n), n =  number of elements.
Worst Case: O(log3 n).
Application
Useful in cases where a binary search would work, but it offers no substantial improvement over binary search in typical applications.

5. Jump Search
Jump search is an algorithm for searching in a sorted array that works by jumping ahead by fixed steps and then performing a linear search within a smaller segment.
The following steps are followed to implement Ternary search (The ;ogic behind the imnplementation)
i. Determine a fixed jump size m (usually √n where n is the number of elements).
ii. Jump ahead by m elements until an element greater than or equal to the key is found or the end of the array is reached.
iii. Perform a linear search within the previous jump segment to find the exact position of the key.
-Time Complexity
Best Case: O(√n) where n is the number of elements.
Average and Worst Case: O(√n).
-Application
Efficient for large, sorted arrays where linear search would be too slow and binary search is not suitable due to frequent jumping.

Both ternary search and jump search are specialized algorithms that provide efficient searching capabilities under specific conditions, particularly with sorted data. Ternary search is more theoretical with limited practical improvements over binary search, while jump search offers a middle ground between linear search and binary search for sorted arrays.
