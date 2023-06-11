package com.example.java.exceptionhandling.custom;

class MyException extends Exception {
    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses above MyException
public class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
            String s="Swagata";
            // Throw an object of user defined exception
            if(s.equals("Swagata"))
            throw new MyException(s+" is not applicable.");
        }
        catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}