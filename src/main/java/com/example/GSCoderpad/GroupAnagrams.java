package com.example.GSCoderpad;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs)
        {
            char chars[]= s.toCharArray();
            Arrays.sort(chars);
            String key= String.valueOf(chars);
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<String>());
            }
            List<String> temp= map.get(key);
            temp.add(s);
            map.put(key, temp);

        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));

    }
}
