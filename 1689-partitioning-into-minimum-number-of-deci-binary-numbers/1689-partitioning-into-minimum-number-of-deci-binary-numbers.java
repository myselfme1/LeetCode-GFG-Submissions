class Solution {
    public int minPartitions(String n) {
        char ch='0';
        for(char i:n.toCharArray())
            if(i>ch)
                ch=i;
        return ch-48;
    }
}