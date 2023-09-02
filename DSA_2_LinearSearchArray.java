/*
2.08.2023
Q1

Write a program to to check if an array contains a number in Java.
int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5
 */

public class DSA_2_LinearSearchArray {
    public static int searchInArray(int[] intArray, int valueToSearch) { // O(1)
            
        int answer = -1; // O(1)
        
        for(int i=0; i<intArray.length; i++){ // O(n)
            
            if(intArray[i] == valueToSearch){ // O(1)
                answer = i; // O(1)
            }
        }
        
        return answer; // O(1)
    }
    // O(n)

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        System.out.println(searchInArray(arr, 6 ));
    }
}
