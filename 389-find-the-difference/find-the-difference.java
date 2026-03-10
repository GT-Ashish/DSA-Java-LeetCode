class Solution {
    public char findTheDifference(String s, String t) {
        int [] array1 = new int[26];
        int [] array2 = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++){
            array1[s.charAt(i) - 'a'] += 1;
            array2[t.charAt(i) - 'a'] += 1;
        }
        array2[t.charAt(len) - 'a'] += 1;
        for(int i = 0; i < 26; i++){
            if(array1[i] != array2[i]){
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}