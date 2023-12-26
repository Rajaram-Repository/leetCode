class Solution:
    def numDecodings(self, s: str) -> int:
        l = len(s) + 1
        dp = [0 ]*l 

        dp[0] = 1 
        dp[1] = 0 if s[0] == "0" else 1 

        for i in range(2,l): 
            # One step jump
            a = s[i-1:i]
            if 0 < int(s[i-1:i]) <= 9:
                dp[i] += dp[i - 1]
            # Two step jump
            b = s[i-2:i]
            if 10 <= int(s[i-2:i]) <= 26:
                dp[i] += dp[i - 2]
        return dp[len(s)]
        
                