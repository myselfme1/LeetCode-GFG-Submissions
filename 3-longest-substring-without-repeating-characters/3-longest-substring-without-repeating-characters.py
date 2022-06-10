class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
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
            #print()
                
        """
        for i in range(len(s)):
            print(s[i])  
            
        """
        #print(L)               
        if len(L)<c:
            return c
        else:
            return len(L)
                
        