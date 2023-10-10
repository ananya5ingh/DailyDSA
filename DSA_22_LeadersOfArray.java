// !! Review !!


/*
9.10.2023
Question:
Write a Java program to print all the LEADERS in the array.  
Note: An element is leader if it is greater than all the elements to its right side.
 */


public class DSA_22_LeadersOfArray{

    public static void leaders(int[] arr){

        int count = 0;
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){

        int arr[] = {10, 9, 14, 23, 15, 0, 9};
        leaders(arr);
    }
}