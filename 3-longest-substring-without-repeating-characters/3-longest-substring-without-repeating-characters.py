class Solution(object):
    def lengthOfLongestSubstring(self, s):
        L={'kk'}
        c=0        
        for i in range(len(s)):
            for ch in range(i,len(s)):
                if s[ch] not in L:
                    #print(s[ch])
                    L.add(s[ch])
                else:
                    if len(L)>c:
                        #print(L)
                        c=len(L)
                    L={'kk'}
                    break             
        if len(L)<c:
            return c-1
        else:
            return len(L)-1
                
        