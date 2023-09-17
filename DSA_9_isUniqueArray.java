/*
16.09.2023

Question:
Write a program to check if an array is unique or not.

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
 */

public class DSA_9_isUniqueArray {
    public static boolean isUnique(int[] intArray) {
        
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i] == intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        
        int[] array = {1,2,6,4,5,6};
        System.out.println(isUnique(array));
    }

    
}
