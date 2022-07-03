class Solution {
    public int wiggleMaxLength(int[] nums) {
       if(nums.length==1)
            return 1;
        else
        {
            int c=1,d=1;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]<nums[i-1])
                    d=c+1;
                else if(nums[i]>nums[i-1])
                    c=d+1;
            }
            if(d>c)
                return d;
            return c;
        }
    }
}