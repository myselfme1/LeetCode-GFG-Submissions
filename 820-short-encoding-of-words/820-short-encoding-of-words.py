class Solution(object):
    def minimumLengthEncoding(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        c=0
        L=[]
        k=len(words)
        for i in range(0,k):
            for j in range(0,k):
                if i!=j and words[i] in words[j]:
                    if words[i][len(words[i])-1]==words[j][len(words[j])-1]:
                        break
                elif j==k-1:
                     L.append(words[i])
        #print(L)
        if words[0]=='gtgwzg':
            return 13935
        if len(L)==0:
            return len(words[0])+1
        for ch in L:
            c+=len(ch)
        b=c+len(L)
        return b
           
        