package com.example.GSCoderpad;


import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class JumbledCollectionOfSegments {

    /**
     * Given a jumbled collection of segments, each of which is represented as
     * a Pair(startPoint, endPoint), this function sorts the segments to
     * make a continuous path.
     *
     * A few assumptions you can make:
     * 1. Each particular segment goes in one direction only, i.e.: if you
     * see (1, 2), you will not see (2, 1).
     * 2. Each starting point only have one way to the end point, i.e.: if
     * you see (6, 5), you will not see (6, 10), (6, 3), etc.
     *
     * For example, if you're passed a list containing the following int arrays:
     *      [(4, 5), (9, 4), (5, 1), (11, 9)]
     * Then your implementation should sort it such:
     *      [(11, 9), (9, 4), (4, 5), (5, 1)]
     *
     * @param segments collection of segments, each represented by a Pair(startPoint, endPoint).
     * @return The sorted segments such that they form a continuous path.
     * @throws Exception if there is no way to create one continuous path from
     *          all the segments passed into this function. Feel free to change the
     *          Exception type as you think appropriate.
     */
    public static List<Pair<Integer, Integer>> sortSegments(final List<Pair<Integer, Integer>> segments)
            throws Exception {
        List<Pair<Integer, Integer>> res = new ArrayList<>();
        if (segments == null || segments.size() == 0) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> right_set = new HashSet<>();

        for (Pair<Integer, Integer> segment : segments) {
            map.put(segment.getLeft(), segment.getRight());
            right_set.add(segment.getRight());
        }
        for (int key : map.keySet()) {
            if (!right_set.contains(key)) {
                if (res.size() == 0) {
                    res.add(new ImmutablePair<Integer, Integer>(key, map.get(key)));
                } else {
                    throw new UnsupportedOperationException("Not implemented yet.");
                }
            }
        }
        while (res.size() < segments.size()) {
            Pair<Integer, Integer> cur = res.get(res.size() - 1);
            if (!map.containsKey(cur.getRight())) {
                if (res.size() != segments.size()) {
                    throw new UnsupportedOperationException("Not implemented yet.");
                } else {
                    break;
                }
            } else {
                Pair<Integer, Integer> curRight= new ImmutablePair<Integer, Integer>(cur.getRight(), map.get(cur.getRight()));
                res.add(curRight);
            }
        }
        return res;
    }

    public static boolean testBasicSort() throws Exception {
        List<Pair<Integer, Integer>> jumbledSegments = new ArrayList<>();
        jumbledSegments.add(new ImmutablePair<Integer, Integer>(4, 5));
        jumbledSegments.add(new ImmutablePair<Integer, Integer>(9, 4));
        jumbledSegments.add(new ImmutablePair<Integer, Integer>(5, 1));
        jumbledSegments.add(new ImmutablePair<Integer, Integer>(11, 9));
        jumbledSegments.add(new ImmutablePair<Integer, Integer>(12, 11));

        List<Pair<Integer, Integer>> actualContinuousPath = sortSegments(jumbledSegments);

        List<Pair<Integer, Integer>> expectedContinuousPath = new ArrayList<>();
        expectedContinuousPath.add(new ImmutablePair<Integer, Integer>(12, 11));
        expectedContinuousPath.add(new ImmutablePair<Integer, Integer>(11, 9));
        expectedContinuousPath.add(new ImmutablePair<Integer, Integer>(9, 4));
        expectedContinuousPath.add(new ImmutablePair<Integer, Integer>(4, 5));
        expectedContinuousPath.add(new ImmutablePair<Integer, Integer>(5, 1));

        return expectedContinuousPath.equals(actualContinuousPath);
    }

    public static boolean doTestsPass() throws Exception {
        boolean allPass = true;
        allPass = allPass && testBasicSort();

        return allPass;
    }

    public static void main(String[] args) throws Exception {
        if(doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Some tests fail");
        }
    }
}

