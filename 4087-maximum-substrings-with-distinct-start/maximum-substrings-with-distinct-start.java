class Solution {
    public int maxDistinct(String s) {
        int [] freqarray = new int [26];
        int length = s.length();
        for(int i = 0; i < length; i++){
            freqarray[s.charAt(i) - 'a'] += 1;
        }
        int countofones = 0;
        for(int frequency : freqarray){
            if(frequency > 0){
                countofones ++;
            }
        }
        return countofones;
        
        
    }
}