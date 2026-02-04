class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int alen = a.length;
        int blen = b.length;
        int asum = 0;
        int bsum = 0;
        for(int element : a){
            asum += element;
        }
        for(int element : b){
            bsum += element;
        }
        for(int i = 0; i < alen; i++){
            for(int j = 0; j < blen; j++){
                if(asum - a[i] + b[j] == bsum - b[j] + a[i]){
                    return new int [] {a[i], b[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}