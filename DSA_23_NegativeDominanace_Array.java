/*
10.10.2023
Question:

Write a Java program that checks whether an array is negative dominant or not. If the array is negative dominant return true otherwise false.  

Example:
Original array of numbers:
[1, -2, -5, -4, 3, -6]
Check Negative Dominance in the said array!true
 */


public class DSA_23_NegativeDominanace_Array {
    
    public static boolean negativeDominance(int[] arr){

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        if(sum<0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        int[] arr = {1, -2, -5, -4, 3, -6, 30,31};
        System.out.println(negativeDominance(arr));
    }
}
