class Solution:
    
    def maxLength(self, arr: List[str]) -> int:
        self.c = 0
        self.arr=arr
        self.arr_l = len(self.arr)
        self.res("",0)
        return self.c
    
    def res(self,str_,index):
        l = len(str_)
        if self.c<l and self.mtd(str_):
            self.c = l
        elif index==self.arr_l:
            return
        for i in range(index,self.arr_l):
            self.res(str_+self.arr[i],i+1)
    
    def mtd(self,word):
        set_ = set()
        for i in word:
            if i in set_:
                return False
            set_.add(i)
        return set_