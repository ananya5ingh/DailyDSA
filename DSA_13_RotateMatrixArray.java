/*
17.09.2023
 
Question:

Rotate Matrix
Given an image represented by an NxN matrix write a method to rotate 
the image by 90 degrees. 
 */

import java.util.Arrays;
public class DSA_13_RotateMatrixArray {

    public static boolean rotateMatrix(int[][] matrix){

        if(matrix.length == 0 || matrix.length != matrix[0].length){
            // ^if 0, matrix doesn't have any elements  ^if not equal, not an nxn matrix
            return false;
        }
        int n = matrix.length;
        for(int layer=0; layer <n/2; layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i=first; i<last; i++){
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first]= matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;

            }
        }

        return true;
    }
    public static void main(String[] args){

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
