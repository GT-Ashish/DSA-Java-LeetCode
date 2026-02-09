class Solution {
    public boolean halvesAreAlike(String s) {
    int right = s.length() - 1;
    int left = 0;
    int vowel1 = 0;
    int vowel2 = 0;
    while(left < right){
        char ch = s.charAt(left);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'o' || ch == 'O' || ch == 'i' || ch == 'I' || ch == 'u' || ch == 'U'){
            vowel1++;
        }
        char ch2 = s.charAt(right);
        if(ch2 == 'a' || ch2 == 'A' || ch2 == 'e' || ch2 == 'E' || ch2 == 'o' || ch2 == 'O' || ch2 == 'i' || ch2 == 'I' || ch2 == 'u' || ch2 == 'U'){
            vowel2++;
        }
        left++;
        right--;
    }
    return vowel1 == vowel2;
    }
}