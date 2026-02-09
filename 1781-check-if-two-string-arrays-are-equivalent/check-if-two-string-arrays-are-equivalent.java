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
        //to compare two string builders using toString()
        //sb doesn't overide equals() due to hashmap logic breaking so its same as using ==
        if(sb.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}