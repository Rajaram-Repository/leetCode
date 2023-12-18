from collections import defaultdict
import heapq
class FoodRatings:

    def __init__(self, foods: List[str], cuisines: List[str], ratings: List[int]):
        self.food_to_cuisine = {}
        self.food_to_rating = defaultdict(int)

        self.cuisine_to_heap = defaultdict(list)
        for i in range(len(foods)):
            self.food_to_cuisine[foods[i]] = cuisines[i]
            self.food_to_rating[foods[i]] = -ratings[i]

            heapq.heappush(self.cuisine_to_heap[cuisines[i]], (-ratings[i], foods[i]))
            
        

    def changeRating(self, food, newRating):
        self.food_to_rating[food] = -newRating
        cuisine = self.food_to_cuisine[food]
        heapq.heappush(self.cuisine_to_heap[cuisine], (-newRating, food))
        

    def highestRated(self, cuisine):
        smallest_lexico = None
        while len(self.cuisine_to_heap[cuisine]) > 0:
            curr = self.cuisine_to_heap[cuisine][0]
            if curr[0] != self.food_to_rating[curr[1]]:
                # delete old data
                heapq.heappop(self.cuisine_to_heap[cuisine])
                continue
            return curr[1]
        return smallest_lexico

                
            
            
        


# Your FoodRatings object will be instantiated and called as such:
# obj = FoodRatings(foods, cuisines, ratings)
# obj.changeRating(food,newRating)
# param_2 = obj.highestRated(cuisine)