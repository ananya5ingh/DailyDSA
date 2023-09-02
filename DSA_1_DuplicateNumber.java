/* 
1.09.2023 
Q1

Write a function which takes integer array as a parameter 
and returns a new integer array with unique elements. (remove duplicates) 
*/

import java.util.Arrays;
public class DSA_1_DuplicateNumber {
  public static int[] removeDuplicates(int[] arr) {
    
    int counter=0; // TC: O(1) // SC: O(1) 
    for(int i=0; i<arr.length; i++){  // TC: O(n) // SC: O(n)
        
        if(arr[i] == Integer.MIN_VALUE){
            continue;
        } // TC: O(1) // SC: O(1)
        
        for(int j=0; j<arr.length; j++){ // TC: O(n) // SC: O(n)
            if(i==j){
               continue; 
            }// TC: O(1) // SC: O(1)
            if(arr[j]==arr[i]){
                arr[j] = Integer.MIN_VALUE;
                counter++;
            }// TC: O(1) // SC: O(1)
        }
    }
    
    int[] result = new int[arr.length-counter]; // TC: O(1) // SC: O(m)
    
    int j=0;
    for(int i=0; i<arr.length; i++){ // TC: O(n) // SC: O(n)
        if(arr[i] != Integer.MIN_VALUE){
            result[j] = arr[i];
            j++;
        }// TC: O(1) // SC: O(1)
        
    }
    
    return result;
  } // TC: O(n^2 + n) // SC: O(n+m)
  
  public static void main (String[] args) {
      
      int[] input = {1, 1, 2, 2, 3, 4, 5};
      // removeDuplicates(input);
      System.out.println(Arrays.toString(removeDuplicates(input)));

  }
}

