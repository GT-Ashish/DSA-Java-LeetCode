class Solution {
    public String longestCommonPrefix(String[] strs) {
        int element = 0;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        int len = strs.length;
        if(len == 1){
            sb.append(strs[0]);
            return sb.toString();
        }
        while(element < len - 1){
            int letters = strs[element].length() - 1;
            int letters2 = strs[element + 1].length() - 1;
            if(index > letters || index > letters2){
                return sb.toString();
            }
            char ch = strs[element].charAt(index);
            char ch2 = strs[element + 1].charAt(index);
            if(ch != ch2){
                return sb.toString();
            }
            if(element == len - 2){
                sb.append(ch);
                element = -1;
                index++;
            }
            element++;
        }
        return sb.toString();
    }
}