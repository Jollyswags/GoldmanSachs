package com.example.java.java12;

public class switcharrow {
    public static void main(String[] args) {
        String day="Friday";
        boolean isWeekend = switch (day)
                {
                    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
                    case "SATURDAY", "SUNDAY" -> true;
                    default -> throw new IllegalStateException("Illegal day entry :: " + day); };
        System.out.println(isWeekend);
    }
}
