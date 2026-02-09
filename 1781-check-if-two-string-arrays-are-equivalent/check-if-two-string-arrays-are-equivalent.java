class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //use this to convert string array directly to string
        String a = String.join("",word1);
        String b = String.join("",word2);
        //forgot that we can directly return this hehe
        return a.equals(b);
    }
}