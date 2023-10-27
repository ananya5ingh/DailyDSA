/*
Day 3 - 27.10.2023
Q3
2824. Count Pairs Whose Sum is Less than Target

Given a 0-indexed integer array nums of length n and an integer target, 
return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 */

import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
    }
}

public class DSA_43_CountPairsWhoseSumLessThanTarget {
    
}
