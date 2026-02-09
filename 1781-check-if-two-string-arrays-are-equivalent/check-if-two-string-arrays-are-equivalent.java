class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //use this to convert string array directly to string
        String a = String.join("",word1);
        String b = String.join("",word2);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}