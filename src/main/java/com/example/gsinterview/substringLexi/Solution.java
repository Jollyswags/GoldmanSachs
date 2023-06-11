package com.example.gsinterview.substringLexi;
import java.util.*;
public class Solution {
    public static List<String> lastSubstring(String s) {
        Set<String> ans=new HashSet<>();
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String temp=s.substring(i,j);
                ans.add(temp);
            }
        }

        List<String> list=new ArrayList<>(ans);
        return list;
    }

    public static void main(String[] args) {
        List<String> list= lastSubstring("kyimafghqcewvbnundlqhtimrzaiaiozrncagisusewebxkozcbqmpfsnclyhnpoccjoupbdxxxnnbjbvrxauszpmsetltlpzgwsptdpevrlgyqdfbgenwfeebczhjhnpmvghlqvnlvfskhoxkhzcyazogcdutqmgkcpesojblnyiaibcdqhnriotwpdvkthgbochasedhckzjtzecyrjwlrjnfeyfpaehddvyjapcaalsaiullozhlmesgwyrqoxyzpstquqsztlcxbdyyovaywmooussgthltojjcopuvotkqkhlzayymxnxdbgcyeqzckiosnxvhlxayhsmmqawjzepzezodwvzclmdjhysijdsogkvacklhmnjalpoynobsqeyuhuyjxrhpidjhakgqjdbedufvjwdajletfzerxenixxivnkpgptzfksjjjgjiiusglgqixhccoaoxoztgidivfvlwgeaemzrdrjpmcwmaibyhnaiesdanstsmjkiahtspcxopuqevajtfouvfheadkmogrwitniekkubywtaglofvkfasklciwomsugmnxpyhfyvyaifyrfeorleviywkgcturuadyrcdwgqwajgvuwvnrqudgoqzwgbkmwfjhbckfdxzkzzokjuhlnhcbpauxkcydzpjfhqncdqejryelozadcnqipgqbcklwpbgzdwlamvdixjzjaboyupgchwjwkvjgprbkuywufxarlifgytbslqrpbquykukzodkhjkgwzmvqxmvaehpcbbvioxdoawsbvmfbceyzurlhxawdicnsdhflwoaioeehoghixiwsbxbqvctmpdfauvzduxrqxesmgmnnddotyynucsdalgrxzddndqmmealzaxlvhnkimvmgsiiitpmfhgcmobpqnnlezewxyzmouiyftaeceqrxjrakjeydobatmydbbgjxpwizkafsjrphqcntwzyjmuryojfcogrx");
        Collections.sort(list,(a,b)->a.compareTo(b));
        String temp="zzokjuhlnhcbpauxkcydzpjfhqncdqejryelozadcnqipgqbcklwpbgzdwlamvdixjzjaboyupgchwjwkvjgprbkuywufxarlifgytbslqrpbquykukzodkhjkgwzmvqxmvaehpcbbvioxdoawsbvmfbceyzurlhxawdicnsdhflwoaioeehoghixiwsbxbqvctmpdfauvzduxrqxesmgmnnddotyynucsdalgrxzddndqmmealzaxlvhnkimvmgsiiitpmfhgcmobpqnnlezewxyzmouiyftaeceqrxjrakjeydobatmydbbgjxpwizkafsjrphqcntwzyjmuryojfcogrx";
        //System.out.println(list);
        System.out.println(list.get(list.size()-1).equals(temp));
    }

}
