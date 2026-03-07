class Solution {
    public int maxPower(String s) {
        int len = s.length();
        int count = 1;
        int max = 0;
        for(int i = 0; i < len - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}