class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        L=[]
        c=0        
        for i in range(len(s)):
            for ch in range(i,len(s)):
                if s[ch] not in L: 
                    L.append(s[ch])
                else:
                    if len(L)>c:
                        c=len(L)
                    L=[]
                    break             
        if len(L)<c:
            return c
        else:
            return len(L)