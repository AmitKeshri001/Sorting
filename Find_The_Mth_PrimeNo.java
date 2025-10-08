package com.amit;

import java.util.Scanner;

public class TCS_question
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number m :");
        int m = input.nextInt();
        System.out.println("here is the mth prime number you want");

        int count = 0;
        int a = 2;
        while(count<m)
        {

            if(isprime(a))
            {
                count++;
                a++;
            }
            else
            {
                a++;
            }
        }
        System.out.println(a-1);

    }
    static boolean isprime(int n)
    {
        for (int j = 2; j<Math.sqrt(n) ; j++)
        {
            if(n%j == 0) {
                return false;

            }
        }
        return true;

    }
}
