class Solution {
    public String reverseWords(String s) {
        s.strip();
        String [] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int len = array.length;
        for(int i = len  - 1; i >= 0; i--){
            if(!array[i].isBlank()){
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        return sb.toString().strip();
    }
}