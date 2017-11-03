package com.janenik.interview;

/**
 * Created by jane on 12/8/16.
 */
public class BinarySearch {
  /*  public static <E extends Comparable<? super E>> int binarySearch(E[] array, E searchItem, int firstIndex, int lastIndex){
        int middleIndex, result;

        if (firstIndex > lastIndex)
            return -1;

        middleIndex = (firstIndex + lastIndex)/2;

        result = searchItem.compareTo(array[middleIndex]);
        if (result == 0)
            return middleIndex; //find

        else if (result < 0)
            return binarySearch(array, searchItem, firstIndex, middleIndex-1);

        else
            return binarySearch(array, searchItem, middleIndex+1, lastIndex);

    }*/

    public static int binarySearchRecursive(int[] array, int key, int first, int last) {
        if (array.length == 0) {
            return -1;
        }

        if (first > last) {
            return -1;
        }

        int mid = (first + last) / 2;

        while (first <= last) {
            if (array[mid] == key) {
                return mid;
            } else if (key > array[mid]) {
                return binarySearchRecursive(array, key, mid + 1, last);
            } else if (key < array[mid]) {
                return binarySearchRecursive(array, key, first, mid - 1);
            }
        }
        return -1;
    }

    //Time complexity O(logN)
    public static int binarySearchIter(int[] array, int key) {
        if (array.length == 0) {
            return -1;
        }

        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (key == array[mid]) {
                return mid;
            } else if (key > array[mid]) {
                first = mid + 1;

            } else if (key < array[mid]) {
                last = mid - 1;
            }
        }
        return -1;
    }
}
