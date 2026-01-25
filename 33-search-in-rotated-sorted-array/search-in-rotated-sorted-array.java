class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(nums[mid] >= nums[0]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        int a = binarysearch(nums,left, nums.length - 1,target);
        int b = binarysearch(nums,0, right, target);
        if(a != -1){
            return a;
        }
        if(b != -1){
            return b;
        }
        return -1;
        
    }
    public static int binarysearch(int [] nums,int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}