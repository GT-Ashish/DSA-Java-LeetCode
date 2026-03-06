class Solution {
    public boolean checkOnesSegment(String s) {
        int len = s.length();
        int i = 0;
        while(i < len && s.charAt(i) == '1'){
            i++;
        }
        while(i < len){
            if(s.charAt(i) == '1'){
                return false;
            }
            i++;
        }
        return true;
    }
}