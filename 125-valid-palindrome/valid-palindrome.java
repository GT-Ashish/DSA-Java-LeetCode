class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')) {
                sb1.append(ch);
            }
        }

        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.reverse();

        return sb1.toString().equals(sb2.toString());
    }
}
