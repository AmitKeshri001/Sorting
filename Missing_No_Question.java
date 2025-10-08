package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//finding missing number
class Leetcode_question
{
    public static void main(String[] args)
    {
        int[] arr = {1,7,5,6};
        int[] c = missingNumber(arr);
        System.out.println(Arrays.toString(c));

    }
    static int[] missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if ( nums[i]>=1&&nums[i]<= nums.length&&nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }

        }
        List<Integer> result = new ArrayList<>();
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1){
                result.add(j+1);
            }
        }
        int[] match = new int[result.size()];
        for (int j = 0; j < result.size(); j++)
        {
            match[j]=result.get(j);

        }
        return match;
    }
}