class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (word.charAt(i) < 'a') {
                count++;
            }
        }
        if (count == len || count == 0 || count == 1 && word.charAt(0) < 'a') {
            return true;
        }
        return false;
    }
}