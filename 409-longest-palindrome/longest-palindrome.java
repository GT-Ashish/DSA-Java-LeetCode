class Solution {
    public int longestPalindrome(String s) {
        int [] f = new int [52];
        int answer = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                f[ch - 'a'] += 1;
            }
            else{
                f[ch - 'A' + 26] += 1;
            }
        }
        int flag = 0;
        for(int i = 0; i < 52; i++){
            if(f[i] >= 2){
                if(f[i] % 2 == 0){
                    answer += f[i];
                }
                else{
                    answer += f[i] - 1;
                    flag = 1;
                }
            }
            else{
                if(f[i] == 1){
                    flag = f[i];
                }
            }
        }
        return flag + answer; 
    }
}