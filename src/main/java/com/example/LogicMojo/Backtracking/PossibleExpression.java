package com.example.LogicMojo.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PossibleExpression {
    public static ArrayList<String> answer;
    public static String digits;
    public static long target;
    public static void recurse(
            int index, long previousOperand, long currentOperand, long value, ArrayList<String> ops) {
        String nums = digits;

        // Done processing all the digits in num
        if (index == nums.length()) {

            // If the final value == target expected AND
            // no operand is left unprocessed
            if (value == target && currentOperand == 0) {
                StringBuilder sb = new StringBuilder();
                ops.subList(1, ops.size()).forEach(v -> sb.append(v));
                answer.add(sb.toString());
            }
            return;
        }

        // Extending the current operand by one digit
        currentOperand = currentOperand * 10 + Character.getNumericValue(nums.charAt(index));
        String current_val_rep = Long.toString(currentOperand);
        int length = nums.length();

        // To avoid cases where we have 1 + 05 or 1 * 05 since 05 won't be a
        // valid operand. Hence this check
        if (currentOperand > 0) {

            // NO OP recursion
            recurse(index + 1, previousOperand, currentOperand, value, ops);
        }

        // ADDITION
        ops.add("+");
        ops.add(current_val_rep);
        recurse(index + 1, currentOperand, 0, value + currentOperand, ops);
        ops.remove(ops.size() - 1);
        ops.remove(ops.size() - 1);

        if (ops.size() > 0) {

            // SUBTRACTION
            ops.add("-");
            ops.add(current_val_rep);
            recurse(index + 1, -currentOperand, 0, value - currentOperand, ops);
            ops.remove(ops.size() - 1);
            ops.remove(ops.size() - 1);

            // MULTIPLICATION
            ops.add("*");
            ops.add(current_val_rep);
            recurse(
                    index + 1,
                    currentOperand * previousOperand,
                    0,
                    value - previousOperand + (currentOperand * previousOperand),
                    ops);
            ops.remove(ops.size() - 1);
            ops.remove(ops.size() - 1);
        }
    }
    public static ArrayList<String> possibleExpressions(String s, int t) {
        // Write your code here
        if (s.length() == 0) {
            return new ArrayList<String>();
        }

        target = t;
        digits = s;
        answer = new ArrayList<String>();
        recurse(0, 0, 0, 0, new ArrayList<String>());
        return answer;

    }
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(1);
        list.add(5);
        System.out.println(possibleExpressions("1267",20));
    }
}
