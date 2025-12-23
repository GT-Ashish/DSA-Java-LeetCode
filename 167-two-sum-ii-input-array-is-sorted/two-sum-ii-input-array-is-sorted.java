class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int[] array = {-1,-1};
        int end = numbers.length - 1;
        while(start<end){
            if (numbers[start] + numbers[end] == target) {
                array[0] = ++start;
                array[1] = ++end;
                return array;
            } 
            else if (numbers[start] + numbers[end] < target) {
                start += 1;
            } 
            else {
                end -= 1;
            }
        }
        return array;
    }
}