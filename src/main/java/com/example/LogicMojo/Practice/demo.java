package com.example.LogicMojo.Practice;

import java.util.*;

public class demo {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char s[]=strs[i].toCharArray();
            Arrays.sort(s);
            String leader=String.valueOf(s);
            if(!map.containsKey(leader))
            {
                map.put(leader, new ArrayList<String>());
            }
            List<String> temp= map.get(leader);
            temp.add(strs[i]);
            map.put(leader, temp);
        }
        anagrams= new ArrayList<>(map.values());
        return anagrams;
    }
    public static void main(String args[])
    {
        String str []= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
}
