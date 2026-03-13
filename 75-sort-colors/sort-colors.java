class Solution {
    public void sortColors(int[] nums) {
        int white = 0;
        int red = 0;
        for(int element : nums){
            if(element == 0){
                red++;
            }
            else if(element == 1){
                white++;
            }
        }
        white += red;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(i < red){
                nums[i] = 0;
            }
            else if(i >= red && i < white){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
        }
    }
}