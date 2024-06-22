package com.SearchingAlgprithms;

public class SearchingAlgorithms {
    public int linearSearch (int [] array,int target) {
        for (var i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;
        return -1;
    }
public int binarySearch1(int [] array, int target){
        return binarySearch1(0, (array.length -1), array, target);
}
    private int binarySearch1(int left, int right,
            int [] array, int target){
        if (right < left)
            return  -1;

        int middle =(left + right)/2;

        if (array[middle] == target)
            return middle;

        if(array[middle] < target)
            return binarySearch1(left, middle-1, array, target);

        return binarySearch1(middle+1, right, array, target);

    }
    public int binarySearch(int target, int [] array){
        var left = 0;
        var right = array.length -1;

        while(left <= right) {
            var middle = left + right / 2;

            if (array[middle] == target)
                return middle;

            if(array[middle] > target)
                right = middle-1;
            else
                left = middle +1;
        }
        return  -1;
    }
    public  int ternarySearch(int target, int [] array){
        return ternarySearch(array, 0, target, array.length - 1);
    }
 private int ternarySearch(
       int [] array, int left , int target, int right ){
        if(left > right)
            return -1;

        int partitionSize = (right - left )/3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if(array[mid1] == target)
            return mid1;

        if(array[mid2] == target)
            return mid2;

        if(target < array[mid1])
            return ternarySearch(array, left, target, mid1 - 1);

        if (target > array[mid2])
            return ternarySearch(array, mid2 +1, target, right );

        return ternarySearch(array, mid1 +1, target, mid2 - 1);
 }
 //ideal block size is square root of the array size
public int jumpSearch(int [] array, int target){
        int blockSize = (int)Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (array[next -1] < target){
start = next;
if (start >= array.length)
    break;

next += blockSize;

if( next > array.length)
    next = array.length;
        }
    for(var i =0; i < next; i++)
        if(array[i] == target)
            return i;

    return  -1;
}
public int exponentialSearch(int [] array, int target){
        int bound = 1;
        while(bound < array.length &&
                array[bound] < target)
            bound *=2;

        int left = bound /2;
        int right = Math.min(bound, array.length -1);
        return binarySearch1(left, right, array, target);
}
}
