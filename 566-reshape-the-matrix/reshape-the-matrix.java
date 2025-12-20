class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList <Integer> list=new ArrayList<>();
        int rows=mat.length;
        for(int[]array:mat){
            for(int element:array){
                list.add(element);
            }
        }
        int size=list.size();
        System.out.print(size);
        if(size!=(r*c) || rows==r && size==(r*c)){
            return mat;
        }
        int [][] answer=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                answer[i][j]=list.get(0);
                list.remove(0);
            }
        }
        return answer;
        

        
        
    }
}