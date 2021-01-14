package com.janenik.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static List<Interval> employeeFreeTime(List<List<Interval>> schedule) {

        List<Interval> list = new ArrayList<>();

        for (List<Interval> interval : schedule) {
            list.add(new Interval(Integer.MIN_VALUE, interval.get(0).start));
            for (int i = 1; i < interval.size(); i++) {
                if (interval.get(i).start > interval.get(i - 1).end) {
                    list.add(new Interval(interval.get(i - 1).end, interval.get(i).start));
                }
            }
            list.add(new Interval(interval.get(interval.size() - 1).end, Integer.MAX_VALUE));
        }

        Collections.sort(list, (a, b) -> Integer.compare(a.start, b.start));

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).start + ", " + list.get(i).end);
        }

        PriorityQueue<Interval> minHeap = new PriorityQueue<>(list.size(), (a, b) -> Integer.compare(a.end, b.end));

        List<Interval> result = new ArrayList<>();

        for (Interval interval : list) {
            while (!minHeap.isEmpty() && interval.start >= minHeap.peek().end) {
                minHeap.poll();
            }

            if(!minHeap.isEmpty()){
                int end = minHeap.peek().end;
                int start = minHeap.peek().start;
                if(interval.start != Integer.MIN_VALUE && interval.start < end && end != Integer.MAX_VALUE){
                    result.add(new Interval(Math.max(interval.start, start), Math.min(interval.end, end)));
                }
            }

            minHeap.offer(interval);
        }
        return result;
    }

    public static void main(String[] args) {

        List<List<Interval>> input = new ArrayList<>();
        input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 2), new Interval(5, 6))));
        input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3))));
        input.add(new ArrayList<Interval>(Arrays.asList(new Interval(4, 10))));

        List<Interval> result = Solution.employeeFreeTime(input);
        System.out.print("Free intervals: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + ", " + interval.end + "] ");
        System.out.println();

        input = new ArrayList<>();
        input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(9, 12))));
        input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
        input.add(new ArrayList<Interval>(Arrays.asList(new Interval(6, 8))));
        result = Solution.employeeFreeTime(input);
        System.out.print("Free intervals: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + ", " + interval.end + "] ");
        System.out.println();
    }
}