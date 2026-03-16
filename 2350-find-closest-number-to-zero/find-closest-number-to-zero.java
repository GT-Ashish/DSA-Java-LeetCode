class Solution {
    public int findClosestNumber(int[] nums) {
        int max = -100001;
        int min = 100001;
        for(int element : nums){
             int diff = Math.abs(0 - element);
             if(diff <= min){
                min = diff;
                if(element == -1 * max){
                    max = Math.max(element, max);
                }
                else{
                    max = element;
                }
             }
        }
        return max;
    }
}