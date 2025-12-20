class Solution {
    public int minDeletionSize(String[] strs) {
        int slen = strs[0].length();
        int count = 0;
        for (int j = 0; j < slen; j++) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    count++;
                    break;
                }

            }
        }
        return count;
    }
}