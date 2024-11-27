class Solution {
    public int minChanges(String s) {
        int l = s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i) != s.charAt(i+1))
            {
                c=c+1;
            }
            i++;
        }
        return c;
    }
}
