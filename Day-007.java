Stock Buy and Sell – Multiple Transaction Allowed
Difficulty: MediumAccuracy: 13.43%Submissions: 149K+Points: 4
The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int maxProf = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1] ) {
                maxProf += prices[i] - prices[i-1];
            }
         }
         return maxProf;
    }
}
