class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        len_1, len_2 = len(text1), len(text2)
        dp = [[0] * (len_2 + 1) for _ in range(len_1 + 1)]
        
        for i in range(1,len_1+1):
            a = text1[i-1]
            for j in range(1,len_2+1):
                if a == text2[j-1]:
                    dp[i][j]= 1+dp[i-1][j-1]
                else:
                    dp[i][j]= max(dp[i][j-1],dp[i-1][j])
                    
        return dp[len_1][len_2]