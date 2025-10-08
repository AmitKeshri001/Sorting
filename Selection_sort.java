package com.amit;

import java.util.Arrays;

public class Selection_sort
{
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int last = arr.length-i-1;
            int max = getmax(arr,0,last);

            swap(arr,max,last);


        }
    }

    static void swap(int[] arr, int max, int last)
    {
        int temp = arr[max];
        arr [max] = arr[last];
        arr[last] = temp;
    }

    static int getmax(int[] arr, int start, int end)
    {
        int max = start;

        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;
    }
}
