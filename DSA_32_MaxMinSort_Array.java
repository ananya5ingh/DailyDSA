/*
13.10.2023
Question:
Write a Java program to sort an array of positive integers from an array. 
In the sorted array the value of the first element should be maximum, the second value should be a minimum, 
third should be the second maximum, the fourth should be the second minimum and so on.  
 */

import java.util.Arrays;
 
public class DSA_32_MaxMinSort_Array
{
     static int[] rearrange(int[] new_arra, int n)
    {
        int temp[] = new int[n];
     
         int small_num = 0, large_num = n-1;
         boolean flag = true;
     
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            flag = !flag;
        }
     
        return temp;
    }
 
    public static void main(String[] args) 
    {
        int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result[];
         
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));
         
        result = rearrange(nums,nums.length);
         
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
     
    }
}

