class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] array = new int[500];
        int max = 0;
        int current = 0;
        int j = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(array[ch] == 0){
                array[ch] += 1;
                current++;
            }
            else{
                max = Math.max(max, current);
                while(s.charAt(j) != ch){
                    array[s.charAt(j)] = 0;
                    j++;
                    current--;
                }
                j++;
            }
        }
        return Math.max(current, max);
    }
}