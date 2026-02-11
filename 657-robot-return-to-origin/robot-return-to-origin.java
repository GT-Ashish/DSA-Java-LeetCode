class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int len = moves.length();
        for(int i = 0; i < len; i++){
            if(moves.charAt(i) == 'U'){
                x++;
            }
            else if(moves.charAt(i) == 'D'){
                x--;
            }
            else if(moves.charAt(i) == 'L'){
                y--;
            }
            else{
                y++;
            }
        }
        return x == 0 && y == 0;
    }
}