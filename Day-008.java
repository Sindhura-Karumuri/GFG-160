Stock Buy and Sell – Max one Transaction Allowed
Difficulty: EasyAccuracy: 49.33%Submissions: 57K+Points: 2
Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else if(price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
