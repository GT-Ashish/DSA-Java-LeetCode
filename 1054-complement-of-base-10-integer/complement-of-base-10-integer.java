class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0 ){
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n % 2);
            n = n / 2;
        }
        int answer = 0;
        int pow = 1;
        int len = sb.length();
        for(int i = 0; i < len; i++){
            int dig = sb.charAt(i);
            if(dig == '0'){
                answer += 2 * pow;
            }
            pow *= 2;
        }
        return answer / 2;
    }
}