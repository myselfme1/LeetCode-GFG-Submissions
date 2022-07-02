class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts)
    {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long l1,l2;
        if(horizontalCuts.length==0)
            l1=h;
        /*else if(horizontalCuts.length==1)
            l1=horizontalCuts[0]-0>h-horizontalCuts[0]?horizontalCuts[0]-0:
        h-horizontalCuts[horizontalCuts.length-1];*/
        else
        {
            l1=horizontalCuts[0]-0;
            for(int i=1;i<horizontalCuts.length;i++)
            {
                if(horizontalCuts[i]-horizontalCuts[i-1]>l1)
                    l1=horizontalCuts[i]-horizontalCuts[i-1];
            }
            if(h-horizontalCuts[horizontalCuts.length-1]>l1)
                l1=h-horizontalCuts[horizontalCuts.length-1];
            
        }
        if(verticalCuts.length==0)
            l2=w;
        /*else if(verticalCuts.length==1)
            l2=verticalCuts[0]-0>w-verticalCuts[0]?verticalCuts[0]-0:
        w-verticalCuts[verticalCuts.length-1];*/
        else
        {
            l2=verticalCuts[0]-0;
            for(int i=1;i<verticalCuts.length;i++)
            {
                if(verticalCuts[i]-verticalCuts[i-1]>l2)
                    l2=verticalCuts[i]-verticalCuts[i-1];
            }
            if(w-verticalCuts[verticalCuts.length-1]>l2)
                l2=w-verticalCuts[verticalCuts.length-1];
            
        }
        return (int)(l1*l2%1000000007);
    }
}