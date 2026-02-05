class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(arr[i] == 2 * arr[j] || arr[i] * 2 == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}