class Solution(object):
    def lengthOfLongestSubstring(self, s):
        L=[]
        c=0        
        for i in range(len(s)):
            for ch in range(i,len(s)):
                if s[ch] not in L:
                    #print(s[ch])
                    L.append(s[ch])
                else:
                    if len(L)>c:
                        #print(L)
                        c=len(L)
                    L=[]
                    break             
        if len(L)<c:
            return c
        else:
            return len(L)
                
        