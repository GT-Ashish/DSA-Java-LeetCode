class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int glen = g.length;
        int slen = s.length;
        int count = 0;
        int j = 0;
        for(int i = 0; i < glen; i++){
            if(j < slen){
                if(g[i] <= s[j]){
                    count++;
                }
                else{
                    i--;
                }
                j++;
            }
        }
        return count;
    }
}