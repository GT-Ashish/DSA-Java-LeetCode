class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        while(ans%2!=0 || ans==0){
            ans+=n;
        }
        return ans;
        
    }
}