class Solution {
    public int minimumIndex(int[] capacity, int size) {
        int answer = 101;
        int index = -1;
        int len = capacity.length;
        for (int i = 0; i < len; i++) {
            if (capacity[i] >= size && capacity[i] < answer) {
                answer = capacity[i];
                index = i;
            }
        }
        return index;
    }
}