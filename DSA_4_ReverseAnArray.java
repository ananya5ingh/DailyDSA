/*
4.09.2023
Q1.

Create a method which takes an array as a parameter and reverses it.
*/

import java.util.Arrays;
class Operations{

    public int[] reverseArray(int[] arr){

        int[] reversedArr = new int [arr.length];

        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            reversedArr[j] = arr[i];
            j++;
        }

        return reversedArr;
    }
}

public class DSA_4_ReverseAnArray {
    
    public static void main(String[] args){

        Operations  obj1 = new Operations();

        int[] myArray = {11,22,33,44};
        System.out.println(Arrays.toString(obj1.reverseArray(myArray))); 
    }
}
