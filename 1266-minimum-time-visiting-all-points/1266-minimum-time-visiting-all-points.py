class Solution:
    def get(self,from1:List[int],to:List[int]):
        return max(abs(from1[0]-to[0]),abs(from1[1]-to[1]))
        
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        c = 0
        for i in range(1,len(points)):
            c += self.get(points[i-1],points[i])
        return c
            
            