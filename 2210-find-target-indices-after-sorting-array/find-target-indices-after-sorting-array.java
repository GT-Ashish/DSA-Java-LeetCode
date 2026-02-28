class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0; 
        int right = len - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                list.add(mid);
                int copy = mid;
                while(mid + 1 < len && nums[mid + 1] == target){
                    list.add(mid + 1);
                    mid++;
                }
                while(copy - 1 >= 0 && nums[copy - 1] == target){
                    list.add(copy - 1);
                    copy--;
                }
                
                break;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        Collections.sort(list);
        return list;
        
    }
}