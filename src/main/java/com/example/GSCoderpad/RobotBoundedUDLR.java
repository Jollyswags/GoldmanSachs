package com.example.GSCoderpad;

import java.util.ArrayList;
import java.util.List;

public class RobotBoundedUDLR {
    public static List<Integer> isRobotBounded(String move) {

        int l = move.length();
        int countUp = 0, countDown = 0;
        int countLeft = 0, countRight = 0;

        // traverse the instruction string
        // 'move'
        for (int i = 0; i < l; i++)
        {
            // for each movement increment
            // its respective counter
            if (move.charAt(i) == 'U')
                countUp++;

            else if (move.charAt(i) == 'D')
                countDown++;

            else if (move.charAt(i) == 'L')
                countLeft++;

            else if (move.charAt(i) == 'R')
                countRight++;
        }
        List<Integer> list=new ArrayList<>();
        list.add((countRight - countLeft) );
        list.add((countUp - countDown));
        return list;
    }

    public static void main(String[] args) {
        System.out.println(isRobotBounded("UUUDULR"));
    }
}
