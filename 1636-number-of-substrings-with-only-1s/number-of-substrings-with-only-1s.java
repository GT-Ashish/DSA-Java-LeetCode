class Solution {
    public int numSub(String s) {
        //no n * n + 1 / 2 formula needed diretly adding.
        int len = s.length();
        int count = 0;
        long substring = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '1'){
                count++;
                substring += count;
            }
            else{
                count = 0;
            }
        }
        return (int)(substring % 1000000007);
    }
}