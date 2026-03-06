class Solution {
    public int numSub(String s) {
        int len = s.length();
        int count = 0;
        long substring = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                count++;
            }
            else{
                substring += ((long)count * (count + 1)) / 2 % 1000000007;
                count = 0;
            }
        }
        if(count > 0){
            substring += ((long)count * (count + 1)) / 2 % 1000000007;
        }
        return (int)(substring % 1000000007);
    }
}