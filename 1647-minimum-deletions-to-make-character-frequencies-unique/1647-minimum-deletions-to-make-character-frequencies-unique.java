class Solution {
    public int minDeletions(String s) {
        int arr[]=new int[26];
        for(int i:arr)
            i=0;
        for (int i=0;i<s.length();i++)
            arr[s.charAt(i)-97]++;
        Arrays.sort(arr);
        /*for(int i:arr)
            System.out.println(i);*/
        int c=0,max=s.length();
        for(int i=25;i>=0;i--)
        {
            if(arr[i]>0)
            {
                if(arr[i]>max)
                {
                    c=c+(arr[i]-max);
                    arr[i]=max;
                }
                if(arr[i]-1>0)
                    max=arr[i]-1;
                else
                    max=0;
            }
        }
        return c;
    }
}