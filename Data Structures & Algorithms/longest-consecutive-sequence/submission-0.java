class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 0;
        int count = 0;
        if (nums.length == 0)
            return 0;
            
        count = 1;
        longest = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }
}