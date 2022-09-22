class Solution {
    public int maxSubArray(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            int s=0;
            if(nums[i-1]>0)
                nums[i]+=nums[i-1];
        }
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
            if(nums[i]>max)
                max=nums[i];
        return max;
    }
}