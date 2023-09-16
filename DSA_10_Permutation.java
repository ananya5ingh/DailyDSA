/*
16.09.2023

Question:
Permutation
Your are given two integer arrays. 
Write a program to check if they are permutation of each other.

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)

Output: true
 */

public class DSA_10_Permutation {
        public static boolean permutation(int[] array1, int[] array2){
            
            boolean result = false;
            for(int i=0; i<array1.length; i++){
                boolean flag = false;
                for(int j=0; j<array2.length; j++){
                    if(array2[j] == array1[i]){
                        flag = true;
                        break;
                    }
                    else{
                        if(j == array2.length-1){
                        flag = false;
                        return flag;
                        }
                        continue;
                    }

                }
                result = flag;
            }
            return result;
        }
    
         // TC: O(n^2)

         public static void main(String[] args){
            int[] array1 = {1,2,3,4,5};
            int[] array2 = {5,8,2,3,4};
            System.out.println(permutation(array1, array2));
         }
}
