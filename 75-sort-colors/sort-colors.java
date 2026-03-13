class Solution {
    public void sortColors(int[] nums) {
        // using dutch national flag algo
        int start = 0;
        int middle  = 0;
        int end = nums.length - 1;
        while(middle <= end){
            //while swapping with start the value will always be one as in the region between start and mid there are all ones so we increment mid while swapping with 1;
            if(nums[middle] == 0){
                    nums[middle] = 1;
                    nums[start] = 0;
                    start++;
                    middle++;
            }
            //while swapping with end we don't know what the value the end will contain hence we dont move mid and check it again;
            else if(nums[middle] == 2){
                    nums[middle] = nums[end];
                    nums[end] = 2;
                    end--;
            }
            else{
                middle++;
            }
        }
    }
}