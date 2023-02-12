package com.example.LogicMojo.Sort;
//SC: O(1)
//TC: O(N^2)
public class SelectionSort {
    public static void main(String args[])
    {
        int arr[] = {10,8,5,1};

        sortfunctin(arr);

        for(int i: arr)
            System.out.print(i+" ");
    }
    public static void sortfunctin(int arr[])
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min_index=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }

            int temp= arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
}
