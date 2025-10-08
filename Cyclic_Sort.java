package com.amit;

import java.util.Arrays;

public class Cyclic_Sort
{
    public static void main(String[] args) {
        int[] arr = {4,8,6,7,5,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }

    }

    static void swap(int[] arr, int i, int i1)
    {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1]=temp;
    }
}
