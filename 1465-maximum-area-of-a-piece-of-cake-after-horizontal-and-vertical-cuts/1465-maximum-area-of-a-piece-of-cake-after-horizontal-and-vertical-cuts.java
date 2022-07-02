class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts)
    {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long l1,l2;
            l1=horizontalCuts[0]-0;
            for(int i=1;i<horizontalCuts.length;i++)
            {
                if(horizontalCuts[i]-horizontalCuts[i-1]>l1)
                    l1=horizontalCuts[i]-horizontalCuts[i-1];
            }
            if(h-horizontalCuts[horizontalCuts.length-1]>l1)
                l1=h-horizontalCuts[horizontalCuts.length-1];
            
            l2=verticalCuts[0]-0;
            for(int i=1;i<verticalCuts.length;i++)
            {
                if(verticalCuts[i]-verticalCuts[i-1]>l2)
                    l2=verticalCuts[i]-verticalCuts[i-1];
            }
            if(w-verticalCuts[verticalCuts.length-1]>l2)
                l2=w-verticalCuts[verticalCuts.length-1];
        return (int)(l1*l2%1000000007);
    }
}