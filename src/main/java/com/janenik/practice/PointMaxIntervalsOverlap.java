package com.janenik.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by jane on 10/27/20.
 */
public class PointMaxIntervalsOverlap {

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>() {
            {
                add(new Interval(10, 12));
                add(new Interval(1, 4));
                add(new Interval(2, 5));
                add(new Interval(5, 9));
                add(new Interval(5, 12));
            }
        };
        System.out.println("Maximum Number of Guests = "+
                " at time " + findPoint(input));

        System.out.println();

        int[][] arr = {{10,12}, {1, 4}, {5, 12}, {2, 5}, {5, 9}};

        int[] result = maxGuestsAndTime(arr);

        System.out.println("Maximum Number of Guests = "+ result[0] +
                " at time " + result[1]);

    }

    public static int findPoint(List<Interval> intervals) {
        if (intervals.isEmpty() || intervals.size() <= 1) {
            return -1;
        }

        int point = -1;

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Interval> minHeap = new PriorityQueue<>(intervals.size(), (a, b) -> Integer.compare(a.end, b.end));
        int p = intervals.get(0).start;
        int guests = 1;
        int maxGuests = 1;
        for (int i = 1; i < intervals.size(); i++) {
            while (!minHeap.isEmpty() && intervals.get(i).start >= minHeap.peek().end) {
                maxGuests--;
                minHeap.poll();
            }

            minHeap.offer(intervals.get(i));
            maxGuests++;
            if (guests < maxGuests) {
                guests = maxGuests;
                p = intervals.get(i).start;
            }
        }
        return p;
    }

    public static int[] maxGuestsAndTime(int[][] intervals){
        int[] result = new int[2];
        if(intervals.length < 1 || intervals == null){
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        if(intervals.length == 1){
            result[0] = 1;
            result[1] = intervals[0][0];
            return result;
        }

        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];

        for(int i = 0; i< intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int length = start.length;
        int maxGuests = 0;
        int guests = 0;
        int time = start[0];
        int i = 0;
        int j = 0;

        while(i < length && j < length){
            if(start[i] > end[j]){
                guests--;
                j++;
            }else {
                guests++;
                if(guests > maxGuests){
                    maxGuests = guests;
                    time = start[i];
                }
                i++;
            }
        }
        result[0] = maxGuests;
        result[1] = time;
        return result;
    }
}

class Interval {
    int start;
    int end;

      Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
