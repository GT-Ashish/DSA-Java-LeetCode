class Solution {
    public char findTheDifference(String s, String t) {
        //using ascii sum
        int len = s.length();
        int sum1 = 0;
        int sum2 = t.charAt(len);
        for(int i = 0; i < len; i++){
            sum1 += s.charAt(i);
            sum2 += t.charAt(i);
        }
        return (char)(sum2 - sum1);
    }
}