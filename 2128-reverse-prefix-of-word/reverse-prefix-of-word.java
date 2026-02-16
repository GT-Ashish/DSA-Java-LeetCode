class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int len = word.length();
        int flag = 0;
        for(int i = 0; i < len; i++){
            char letter = word.charAt(i);
            if(flag == 0 && letter == ch){
                sb.append(letter);
                sb.reverse();
                flag++;
            }
            else{
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}