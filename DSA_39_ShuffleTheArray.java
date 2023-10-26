/*
Day 2
Q2
1470. Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

 class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[2*n];

        int j=0;
        int k=n;
    
        for(int i=0; i<ans.length; i++){
            
            int leftArr = nums[j];
            int rightArr = nums[k];

            if(i%2 == 0){
                    ans[i] = leftArr;
                    j++;
            }
            else{
                    ans[i] = rightArr;
                    k++;
                
            }
        }
        return ans;
    }
}

public class DSA_39_ShuffleTheArray {
    
}
