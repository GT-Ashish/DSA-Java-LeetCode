class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");
        for (String str : array) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb.append(sb2.reverse());
            sb.append(" ");
        }
        return sb.toString().strip();
    }
}