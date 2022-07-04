class Solution {
    public int candy(int[] ratings)
    {
        int arr[]=new int[ratings.length];
        for(int i=0;i<arr.length;i++)
            arr[i]=1;
        for(int i=1;i<arr.length;i++)
            if(ratings[i]>ratings[i-1])
                arr[i]=arr[i]+arr[i-1];
        int B[]=new int[ratings.length];
        for(int i=0;i<arr.length;i++)
            B[i]=1;
        for(int i=arr.length-2;i>=0;i--)
            if(ratings[i]>ratings[i+1])
                B[i]=B[i]+B[i+1];
        int s=0;
        for(int i=0;i<arr.length;i++)
            s=arr[i]>B[i]?s+arr[i]:s+B[i];
        return s;
        
    }
}