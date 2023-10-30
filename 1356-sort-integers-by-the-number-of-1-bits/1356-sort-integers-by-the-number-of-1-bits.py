class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        d ={}
        for i in arr:
            key=0
            num = format(int(i), 'b')
            for j in num[::-1]:
                key += int(j)
            if key in d.keys():
                l = d[key]
                l.append(i)
                d[key] = l
            else:
                l =[]
                l.append(i)
                d[key] = l
        a=[]
        sorted_dict = dict(sorted(d.items()))
        for key,val in sorted_dict.items():
            val.sort()
            a.extend(val)
        return a
        