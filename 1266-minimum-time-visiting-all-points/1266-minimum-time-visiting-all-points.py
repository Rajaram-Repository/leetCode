class Solution:
    def get(self,from1:List[int],to:List[int]):
        x = abs(from1[0]-to[0])
        y = abs(from1[1]-to[1])
        return max(x,y)
        
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        c = 0
        for i in range(1,len(points)):
            c += self.get(points[i-1],points[i])
        return c
            
            