package com.amit;

public class Leetcode_question_02
{
    public static void main(String[] args) {
        int[] arr ={2,3,1,4,2,5};
        int c = duuplicate(arr);
        System.out.println(c);

    }

    static int duuplicate(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0;j<arr.length;j++)
        {
            if(arr[j] != j+1)
            {
                return arr[j];
            }

        }
        return -1;
    }

    static void swap(int[] arr, int i, int correct)
    {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
