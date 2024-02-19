class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        for price in range(1, len(prices)):
            if prices[price]-prices[price -1] > 0:
                profit = profit + prices[price]-prices[price -1]

        return profit

        