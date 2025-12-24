class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple) {
            sum += a;
        }
        int length = capacity.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (capacity[j] < capacity[j + 1]) {
                    temp = capacity[j];
                    capacity[j] = capacity[j + 1];
                    capacity[j + 1] = temp;
                }
            }

        }

        for (int i = 0; i < length; i++) {
            sum -= capacity[i];
            if (sum <= 0) {
                return i + 1;
            }
        }
        return -1;
    }
}