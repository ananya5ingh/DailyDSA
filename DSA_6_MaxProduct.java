/*
5.09.2023
Q1

Max Product of Two Integers
How to find maximum product of two integers in the array 
where all elements are positive.

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50
 */


public class DSA_6_MaxProduct {
    public static int maxProduct(int[] intArray) {
        
        int maxProduct=0;
        for(int i=0; i<intArray.length; i++){
            for(int j=0; j<intArray.length; j++){
                if(intArray[i] == intArray[j]){
                    continue;
                }
                else{
                    int localProduct = intArray[i]*intArray[j];
                    if(localProduct>maxProduct){
                        maxProduct=localProduct;
                    }
                }
            }
        }
        return maxProduct;
    }
    
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        System.out.println(maxProduct(arr));
    }
}