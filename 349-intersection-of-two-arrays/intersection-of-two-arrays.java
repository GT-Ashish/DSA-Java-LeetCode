class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int [] f1 = new int [1001];
        int [] f2 = new int [1001];
        for(int element : nums1){
            f1[element] += 1;
        }
        for(int element : nums2){
            f2[element] += 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 1000; i++){
            if(f1[i] > 0 && f2[i] > 0){
                list.add(i);
            }
        }
        int len = list.size();
        int [] array = new int [len];
        for(int i = 0; i < len; i++){
            array[i] = list.get(i);
        }
        return array;
    }
}