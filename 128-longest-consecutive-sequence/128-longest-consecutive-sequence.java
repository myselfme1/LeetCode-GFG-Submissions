class Solution {
    public int longestConsecutive(int[] nums) {
        int c=0,d=1;
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                d++;
            }
            else if(nums[i]>nums[i-1]+1)
            {
                if(d>c)
                    c=d;
                d=1;
            }
        }
        if(d>c)
            c=d;
        return c;
    }
}