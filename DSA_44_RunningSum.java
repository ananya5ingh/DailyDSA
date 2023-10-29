/*
Day 4 - 28.10.2023
Q1
1480. Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */



 class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i]+nums[i-1]; 
        }
        return nums;
    }
}
public class DSA_44_RunningSum {
    
}
