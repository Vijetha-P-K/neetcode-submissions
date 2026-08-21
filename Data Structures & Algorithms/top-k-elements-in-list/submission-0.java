class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] frequency = new int[2001];
        for (int i = 0; i < nums.length; i++) {
            frequency[nums[i] + 1000]++;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int max = 0;
            int element = 0;
            for (int j = 0; j < 2001; j++) {
                if (frequency[j] > max) {
                    max = frequency[j];
                    element = j - 1000;
                }
            }
            result[i] = element;
            frequency[element + 1000] = 0;
        }
        return result;
    }
}