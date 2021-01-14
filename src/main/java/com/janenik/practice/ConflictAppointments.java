package com.janenik.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jane on 10/24/20.
 */
public class ConflictAppointments {
    public static void main(String[] args) {

        Intervals[] intervals = {new Intervals(4, 5), new Intervals(2, 3), new Intervals(3, 6), new Intervals(5, 7), new Intervals(7, 8)};
        Map<Intervals, List<Intervals>> map = conflict(intervals);

        for (Map.Entry<Intervals, List<Intervals>> entry : map.entrySet()) {
            for (Intervals interval : entry.getValue()) {
                System.out.print("[" + entry.getKey().start + ", " + entry.getKey().end + "] and [" + interval.start + ", " + interval.end + "] is conflict.\n");
            }
            System.out.println();
        }
    }

    public static Map<Intervals, List<Intervals>> conflict(Intervals[] intervals) {
        if (intervals.length == 0) {
            throw new IllegalArgumentException();
        }

        Map<Intervals, List<Intervals>> map = new HashMap<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        for (int i = 1, j = 0; i < intervals.length; i++) {
            if (intervals[j].end > intervals[i].start) {
                if (!map.containsKey(intervals[j])) {
                    map.put(intervals[j], new ArrayList<>());
                }
                map.get(intervals[j]).add(intervals[i]);
            } else {
                j++;
            }
        }
        return map;
    }
}

class Intervals {
    int start;
    int end;

    Intervals(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
