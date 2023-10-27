/*
Day 3 - 27.10.2023
Q2
1431. Kids With the Greatest Number of Candies

There are n kids with candies. You are given an integer array candies, where each candies[i] 
represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, 
after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = -1;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
}
public class DSA_42_KidsWithGreaterNoOfCandies {
    
}
