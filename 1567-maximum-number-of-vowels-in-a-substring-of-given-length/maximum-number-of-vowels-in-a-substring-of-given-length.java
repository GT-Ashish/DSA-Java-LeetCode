class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        int max = count;
        if (max == k) {
            return k;
        }
        int len = s.length();
        for (int i = k; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            ch = s.charAt(i - k);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count--;
            }
            max = Math.max(count, max);
            if (max == k) {
                return k;
            }

        }
        return max;
    }
}