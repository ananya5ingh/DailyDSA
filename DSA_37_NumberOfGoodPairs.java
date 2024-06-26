/*
Day 1 - 25.10.2023
Q3
Number Of Good Pairs
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

 class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numOfGoodPairs = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    numOfGoodPairs++;
                }
            }
        }
        return numOfGoodPairs;
    }
}


public class DSA_37_NumberOfGoodPairs {
    
}
