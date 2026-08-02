class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minValue = prices[0]
        var profit = 0
        for (i in 1..<prices.size){
            if(prices[i]<minValue){
                minValue = prices[i]
            } else {
                if ((prices[i]-minValue)>profit){
                    profit = prices[i]-minValue
                }
            }
            
        }
        return profit
    }
}
