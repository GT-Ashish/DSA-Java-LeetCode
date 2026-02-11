class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int len = moves.length();
        for(int i = 0; i < len; i++){
            switch(moves.charAt(i)){
                case('U'):
                    x++;
                    break;
                case('D'):
                    x--;
                    break;
                case('L'):
                    y--;
                    break;
                default : 
                    y++;
            }
        }
        return x == 0 && y == 0;
    }
}