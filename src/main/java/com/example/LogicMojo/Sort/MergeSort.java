package com.example.LogicMojo.Sort;

//TC: O(nlogn)
//SC: O(n)
//2^n reccursive calls
class MergeSort {
    public  static void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }

            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }


    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergesort(arr, 0, arr.length - 1);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}

/*
Merge Sort is useful for sorting linked lists in O(N log N) time. and O(1)
Inversion Count Problem: Inversion Count for an array indicates – how far (or close) the array is from being sorted.
If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is the maximum.
External Sorting: External sorting is a class of sorting algorithms that can handle massive amounts of data.
External sorting is required when the data being sorted do not fit into the main memory of a computing device (usually RAM) and
instead they must reside in the slower external memory, usually a disk drive. Thus,
external sorting algorithms are external memory algorithms and thus applicable in the external memory model of computation.
 */