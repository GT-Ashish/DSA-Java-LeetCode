class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        String s = "";
        int count = 1;
        for(int i = 0; i < len - 1; i++){
            if(chars[i] == chars[i + 1]){
                count++;
            }
            else{
                if(count > 1){
                    s += chars[i];
                    s += count;
                    count = 1;
                }
                else{
                    s += chars[i];
                    count = 1;
                }
            }
        }
        if(count > 1){
            s += chars[len - 1];
            s += count;
            count = 1;
        }
        else{
            s += chars[len - 1];
            count = 1;
        }
        len = s.length();
        for(int i = 0; i < len; i++){
            chars[i] = s.charAt(i);
        }
        return len;
    }
}