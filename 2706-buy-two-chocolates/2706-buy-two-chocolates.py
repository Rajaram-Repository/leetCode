class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        prices.sort()
        c =money- (prices[0]+prices[1])
        if c>=0:
            return c
        return money