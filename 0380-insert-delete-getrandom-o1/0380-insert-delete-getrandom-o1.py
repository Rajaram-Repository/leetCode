import random
class RandomizedSet:

    def __init__(self):
        self.data = []

    def insert(self, val: int) -> bool:
        if val in self.data :
            return False
        self.data.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val in self.data :
            self.data.remove(val)
            return True 
        return False

    def getRandom(self) -> int:
        return random.choice(self.data)
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()