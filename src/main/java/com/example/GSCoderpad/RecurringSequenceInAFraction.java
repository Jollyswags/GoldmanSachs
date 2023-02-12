package com.example.GSCoderpad;
import java.util.*;
public class RecurringSequenceInAFraction {

    // This function returns repeating
    // sequence of a fraction. If
    // repeating sequence doesn't
    // exist, then returns empty String
    static String fractionToDecimal(int numr, int denr)
    {
        // Initialize result
        String res = "";

        // Create a map to store already
        // seen remainders. Remainder is
        // used as key and its position in
        // result is stored as value.
        // Note that we need position for
        // cases like 1/6.  In this case,
        // the recurring sequence doesn't
        // start from first remainder.
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.clear();

        // Find first remainder
        int rem = numr % denr;

        // Keep finding remainder until
        //  either remainder becomes 0 or repeats
        while ((rem != 0) && (!mp.containsKey(rem)))
        {
            // Store this remainder
            mp.put(rem, res.length());

            // Multiply remainder with 10
            rem = rem * 10;

            // Append rem / denr to result
            int res_part = rem / denr;
            res += String.valueOf(res_part);

            // Update remainder
            rem = rem % denr;
        }

        if (rem == 0)
            return "";
        else if (mp.containsKey(rem))
            return res.substring(mp.get(rem));

        return "";
    }

    // Driver code
    public static void main(String[] args)
    {
        int numr = 50, denr = 22;
        String res = fractionToDecimal(numr, denr);
        if (res == "")
            System.out.print("No recurring sequence");
        else
            System.out.print("Recurring sequence is "
                    + res);
    }
}
