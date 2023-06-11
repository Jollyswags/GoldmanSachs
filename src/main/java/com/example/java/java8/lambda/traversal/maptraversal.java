package com.example.java.java8.lambda.traversal;

import java.util.HashMap;
import java.util.Map;

public class maptraversal {
    public static void main(String[] args) {
        Map<String,String> muSigma = new HashMap<String,String>();

        // enter name/url pair
        muSigma.put("Alpha", "City");
        muSigma.put("Beta", "Novartis");
        muSigma.put("Gamma", "Microsoft");

        muSigma.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
    }
}
