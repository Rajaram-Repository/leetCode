class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        if len(s)==4:
            l = []
            a = ".".join(s)
            print(a)
            l.append(a)
            return  l
        self.l = []
        self.dfs(s,"",0)
        return self.l
    def dfs(self,s,path,index):
        if index>4:
            return
        if index==4 and not s:
            self.l.append(path[:-1])
        for i in range(1,len(s)+1):
            if s[:i]=="0"  or (s[0]!="0" and 0<int(s[:i])<256 ):
                self.dfs(s[i:],path+s[:i]+".",index+1)