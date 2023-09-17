/*
Started Daily DSA again
16.09.2023

Question:
You are given an array prices where prices[i] is the price of a given stock on the ith day. 
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7, 1, 5, 3, 6, 4] 
Output: 5 
 */

public class DSA_7_BestTimeToBuyNSellStockArray {
    public static int maxProfit(int[] prices) {
        
        int buyStockDay = 0;
        int buyStockValue = prices[buyStockDay];
        for(int j=1; j<prices.length; j++){
                if(prices[j]<prices[buyStockDay]){
                    buyStockDay = j;
                    buyStockValue = prices[buyStockDay];
                }
        }
        // System.out.println("buyStockDay: "+(buyStockDay+1));
        // System.out.println("buyStockValue: "+buyStockValue);
        //System.out.println();
        
        int sellStockDay = buyStockDay;
        int sellStockValue = buyStockValue;
        int profit=0;
        for(int i=buyStockDay+1; i<prices.length; i++){
            if(prices[i]>sellStockValue){
                sellStockDay = i;
                //System.out.println("sellStockDay: "+(sellStockDay+1));
                sellStockValue = prices[i];
                //System.out.println("sellStockValue: "+sellStockValue);
                //System.out.println();
                profit = sellStockValue - buyStockValue;
            }
        }
        
        return profit;
    }
    // TC: O(n) // SC: O(1)

    public static void main(String[] args){

        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }
}

