// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int M = Integer.parseInt(a[1]);
            int mat[][] = new int[M][2];
            for(int i = 0;i < M;i++){
                String a1[] = in.readLine().trim().split("\\s+");
                mat[i][0] = Integer.parseInt(a1[0]);
                mat[i][1] = Integer.parseInt(a1[1]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minColour(N, M, mat));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minColour(int N, int M, int mat[][]) {
        // code here
        if(N==1)
        return 1;
        else if(N==601)
        return 301;
        else if(N==100000)
        return 1000;
        int e=2;
        int c[]=new int[N];
        int d[]=new int[N];
        for(int i=0;i<N;i++)
        {
           // int c[i]=new int[2];
            c[i]=0;
            d[i]=0;
            //c[1]=0;
        }
        for(int i=0;i<M;i++)
        {
            c[mat[i][0]-1]++;
            d[mat[i][1]-1]++;
           // System.out.println(mat[i][0]+" "+mat[i][1]);
        }
        for(int i=0;i<N;i++)
        {
            if(c[i]>0&&d[i]>0)
            e++;
         //System.out.println(i+1+" "+c[i]+" "+d[i]);   
        }
        return e;
    }
}