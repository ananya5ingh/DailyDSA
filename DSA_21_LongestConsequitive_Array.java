//  !! REVIEW !!


/*
9.10.2023
Question:
Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5. 
 */

public class DSA_21_LongestConsequitive_Array {
    
    public static int LongestConsecutiveLength(int[] arr){

        int count = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(j==i){
                    continue;
                }
                else{
                    if(arr[j] == arr[i]+1){
                        count++;
                    }
                    else{
                        continue;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] array1 = {49, 1, 3, 200, 2, 4, 70, 5};
        int[] array2 = {49, 1, 3, 200, 2, 4, 70,71,72,73,74,75,76,77,78, 5};
        System.out.println(LongestConsecutiveLength(array2));
    }
}
