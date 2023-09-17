/*
4.09.2023
Q2

Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. 
Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
*/

class Operations{
        public int removeDuplicates(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    nums[j]=Integer.MIN_VALUE;
                }
            }
        }
        
        int outputLength = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != Integer.MIN_VALUE){
                outputLength++;
            }
        }
        
        return outputLength;
    }
}

public class DSA_5_RemoveDuplicatesArray {
    
    public static void main(String[] args){
        
    Operations obj1 = new Operations();

    int[] myArray = {1,1,2};
    System.out.println(obj1.removeDuplicates(myArray));
    }
}
