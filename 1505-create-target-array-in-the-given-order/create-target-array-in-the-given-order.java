class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList <Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]);
            }
        for(int i=0;i<n;i++){
            nums[i]=list.get(i);
        }
        return nums;
        
    }
}