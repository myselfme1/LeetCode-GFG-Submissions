class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<List<Integer>>();
        //int no=1,d=1;
        for(int i=1;i<=numRows;i++)         // al[i-2][j-2]+al[i-2][j-1]
        {
            List<Integer> l=new ArrayList<Integer>();
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                    l.add(1);
                else 
                    l.add(al.get(i-2).get(j-2)+al.get(i-2).get(j-1));
            }
            al.add(l);
           // l.clear();
        }
      /*  for(int n:l)
        {
            List<Integer> l1=new ArrayList<Integer>();
            while(n>0)
            {
                l1.add(n%10);
                n/=10;
            }
            //System.out.println(l1);
            al.add(l1);
            //System.out.println(al);
        }*/
       // al.add(l);
        return al;
    }
}