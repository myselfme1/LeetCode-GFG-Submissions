class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                c++;
                if(i<2||nums[i-2]<=nums[i])
                    nums[i-1]=nums[i];
                else
                    nums[i]=nums[i-1];
            }
            if(c>1)
                return false;
            
        }          
            return true;
    }
}