/*
13.10.2023
Question:
Write a Java program that separates 0s on the left hand side and 1s on the right hand side from a random array of 0s and 1.
 */


import java.util.Arrays;

public class DSA_33_0s_and_1s_Array {
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1,0 };
        int result[];
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        int n = arr.length;
 
        result = separate_0_1(arr, n);
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
      }
    
    static int [] separate_0_1(int arr[], int n)
     {
        int count = 0;   
     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
 
        for (int i = 0; i < count; i++)
            arr[i] = 0;
 
        for (int i = count; i < n; i++)
            arr[i] = 1;
    
         return arr;
     }       
   }
