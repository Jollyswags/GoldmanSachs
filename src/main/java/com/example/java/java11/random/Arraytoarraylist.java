package com.example.java.java11.random;

import java.util.Arrays;
import java.util.List;

public class Arraytoarraylist {
    public static void main(String[] args) {
        String[] arr = {"1","2","3"};
        List<String> list= Arrays.asList(arr);
        System.out.println(list);

        String[] namesArray =  list.toArray(new String[list.size()]);
        for(String str:namesArray){
            System.out.println(str);
        }


    }
}
