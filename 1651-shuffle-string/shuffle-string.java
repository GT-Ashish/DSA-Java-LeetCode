class Solution {
    public String restoreString(String s, int[] indices) {
        int length = s.length();
        char [] ans = new char[length];
        for(int i = 0; i < length; i++){
            ans[indices[i]] = s.charAt(i);  
        }
        return String.valueOf(ans);
    }
}