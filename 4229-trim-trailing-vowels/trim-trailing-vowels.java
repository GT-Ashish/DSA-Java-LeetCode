class Solution {
    public String trimTrailingVowels(String s) {
    int len = s.length() - 1;
    for(int i = len; i >= 0; i--){
        char ch = s.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                len--;
            }
        else{
            break;
        }
    }   
    return s.substring(0, len + 1);
    }
}