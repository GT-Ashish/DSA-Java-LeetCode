class Solution {
    public boolean halvesAreAlike(String s) {
    String check = "aeiouAEIOU";
    int right = s.length() - 1;
    int left = 0;
    int vowel1 = 0;
    int vowel2 = 0;
    while(left < right){
        if(check.indexOf(s.charAt(left)) != -1){
            vowel1++;
        }
        if(check.indexOf(s.charAt(right)) != -1){
            vowel2++;
        }
        left++;
        right--;
    }
    return vowel1 == vowel2;
    }
}