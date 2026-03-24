class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < len - 1; i++){
            if(chars[i] == chars[i + 1]){
                count++;
            }
            else{
                if(count > 1){
                    sb.append(chars[i]);
                    sb.append(count);
                    count = 1;
                }
                else{
                    sb.append(chars[i]);
                    count = 1;
                }
            }
        }
        if(count > 1){
            sb.append(chars[len - 1]);
            sb.append(count);
            count = 1;
        }
        else{
            sb.append(chars[len - 1]);
            count = 1;
        }
        len = sb.length();
        for(int i = 0; i < len; i++){
            chars[i] = sb.charAt(i);
        }
        return len;
    }
}