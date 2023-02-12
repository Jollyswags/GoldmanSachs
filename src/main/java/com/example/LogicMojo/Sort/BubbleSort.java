package com.example.LogicMojo.Sort;
//SC: O(1)
//TC: O(N^2)
public class BubbleSort {
    public static void main(String args[])
    {
        int arr[]={1,2,3,1,5};
        sort(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr)
    {
        boolean flag;
        for(int i=0;i<arr.length-1;i++)
        {
            flag= false;
            for(int j=0;j< arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
                break;
        }
    }
}
