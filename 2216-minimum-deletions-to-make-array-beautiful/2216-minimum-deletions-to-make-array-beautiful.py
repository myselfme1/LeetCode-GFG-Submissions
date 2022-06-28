class Solution(object):
    def minDeletion(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        i=0
        m=len(nums)
        while i<m-1:
            if (i-c)%2==0 and nums[i]==nums[i+1]:
                c=c+1
                #m=m-1
                #nums.remove(nums[i])
            i=i+1
        if (len(nums)-c)%2!=0:
            return c+1
        return c
        
        
        