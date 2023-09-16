/*
16.09.2023

Question:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */

import java.util.Arrays;

public class DSA_8_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                
                if(j==i){
                    continue;
                }
                else{
                    if(nums[i]+nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
    // TC: O(n^2) // SC: O()??
    

    public static void main(String[] args){

        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

}
