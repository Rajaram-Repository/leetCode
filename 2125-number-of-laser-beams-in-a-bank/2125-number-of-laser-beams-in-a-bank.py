class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        c =0
        prev = 0
        for i in bank:
            curr = i.count("1")
            if curr!=0:
                c += curr * prev
                prev = curr
        return c