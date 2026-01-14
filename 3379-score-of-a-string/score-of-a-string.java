class Solution {
    public int scoreOfString(String s) {
        int length = s.length();
        int sum = 0;
        for(int i = 0; i < length - 1 ;i++){
            sum += Math.abs(s.charAt(i)-s.charAt(i + 1));
        }
        return sum;
        
    }
}