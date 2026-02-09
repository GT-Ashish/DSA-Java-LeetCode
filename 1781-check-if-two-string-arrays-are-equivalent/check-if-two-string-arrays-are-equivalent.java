class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s : word1){
            sb.append(s);
        }
        for(String s : word2){
            sb2.append(s);
        }
        if(sb.length() == sb2.length()){
            int length = sb.length();
            for(int i = 0; i < length; i++){
                if(sb.charAt(i) != sb2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}