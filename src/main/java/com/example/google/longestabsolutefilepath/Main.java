package com.example.google.longestabsolutefilepath;

public class Main {
    public static void main(String[] args) {
        Solution obj=new Solution();
        Solution1 obj1=new Solution1();
        String str="dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(obj.lengthLongestPath(str));
        System.out.println(obj1.lengthLongestPath(str));


    }
}
