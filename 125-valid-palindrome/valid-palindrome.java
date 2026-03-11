class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end) {
            while (start < end && !alphanum(s.charAt(start))) {
                start++;
            }
            while (start < end && !alphanum(s.charAt(end))) {
                end--;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    boolean alphanum(char ch){
        if(ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }
}