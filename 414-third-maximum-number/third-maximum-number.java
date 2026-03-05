class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        for(int element : nums){
            if(element > first){
                first = element;
            }
        }
        int second = Integer.MIN_VALUE;
        for(int element : nums){
            if(element > second && element != first){
                second = element;
            }
        }
        int third = Integer.MIN_VALUE;
        boolean flag = false;
        for(int element : nums){
            if(element >= third && element != second && element != first){
                flag = true;
                third = element;
            }
        }
        if(flag){
            return third;
        }
        return first;
    }
}