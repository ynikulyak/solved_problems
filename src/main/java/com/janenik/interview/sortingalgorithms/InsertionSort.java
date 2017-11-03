package com.janenik.interview.sortingalgorithms;

/**
 * Created by jane on 10/18/17.
 */
public class InsertionSort {
    public static < E extends Comparable< ? super E > >
    void insertionSort(E[] a)
    {
        int k, pos, arraySize;
        E tmp;

        arraySize = a.length;
        for(pos = 1; pos < arraySize; pos++ )
        {
            tmp = a[pos];
            for(k = pos; k > 0 && tmp.compareTo(a[k-1]) < 0; k-- )
                a[k] = a[k-1];
            a[k] = tmp;
        }
    }

}
