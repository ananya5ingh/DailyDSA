/*
3.09.2023
Q1

Create a function which prints the pairs from the given array
{1,3,4,5} // {11,13,14,15,31,33,34,35,...}
 */

import java.util.Arrays;
class Operations{

    public String[] printPairs(int[] arr){

        int n = arr.length;
        String[] newArr = new String[n*n];

        int i=0;
        while(i<newArr.length){
            for(int element1 : arr){
                for(int element2 : arr){
                    newArr[i] = Integer.toString(element1) + Integer.toString(element2);
                    i++;
                }
            }
        }
        return newArr;
    }

}

public class DSA_3_PrintingPairs {

    public static void main(String[] args){

        Operations obj1 = new Operations();

        int[]array = {1,3,4,5,7,8};
        String[] result = obj1.printPairs(array);

        System.out.println(Arrays.toString(result));

    }
}
