class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int length = nums.length;
        while(i < length){
            if(nums[i] != i + 1){
                if(nums[i] != nums[nums[i] - 1]){
                    int temp = nums[i];
                    nums[i] = nums[nums[i] - 1];
                    nums[temp - 1] = temp;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < length; j++){
            if(nums[j] != j + 1){
                return new int[]{nums[j], j+1};
            }
        }
        return new int[]{0,0};
    }
}