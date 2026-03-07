class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int element : arr1){
            int flag = 0;
            for(int ele : arr2){
                if(Math.abs(element - ele) <= d){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                count++;
            }
        }
        return count;
    }
}