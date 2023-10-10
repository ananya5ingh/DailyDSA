/*
10.10.2023
Question:
Write a Java program to shuffle a given array of integers.  

Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
 */

import java.util.Arrays;
import java.util.Random;

public class DSA_25_ShuffleArrayElements {

    public static void shuffleElements(int[] arr){
        
        for(int i=0; i<arr.length; i++){

            Random rand = new Random();
            int j = rand.nextInt(i+1);
            swapElements(arr, i, j);
        }
    }

    public static void swapElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){

        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array: "+Arrays.toString(nums));
		shuffleElements(nums);
		System.out.println("Shuffle Array: "+Arrays.toString(nums));
        
    }
}
