class Solution {
    public String reverseVowels(String s) {
        char [] array = s.toCharArray();
        String vowel = "aeiouAEIOU";
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            char ch = array[left];
            while(left < right && vowel.indexOf(ch) == -1){
                left++;
                ch = array[left];
            }
            ch = array[right];
            while(left < right && vowel.indexOf(ch) == -1){
                right--;
                ch = array[right];
            }
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(array);
    }
}