package com.example.LogicMojo.Recursion;
//SC: O(N)
//TC: O(N)
public class Reverseanarray {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        reversefunc(arr,0,arr.length-1);
        for(int i: arr)
            System.out.print(i+" ");
    }
    public static void reversefunc(int arr[],int i, int j)
    {
        if(i>=j)
            return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reversefunc(arr,i+1,j-1);

    }
}
