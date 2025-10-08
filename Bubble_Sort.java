package com.amit;

import java.util.Arrays;

public class Bubble_sort
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,9,7,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr)
    {
        boolean swapped = false;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j< arr.length-i;j++)
            {
                //swap if the itm is smaller than the previous item
                if(arr[j] <arr[j-1])
                {
                    //swap
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if( swapped==false)
            {
                break;
            }
        }


    }
}
