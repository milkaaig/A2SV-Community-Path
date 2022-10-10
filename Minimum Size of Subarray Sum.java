class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || target < 0) {
            throw new IllegalArgumentException("Input array is null");
        }

        int len = nums.length;
        int start = 0;
        int end = 0;
        int minLen = len + 1;

        while (end < len) {
            target -= nums[end];
            end++;

            while (target <= 0) {
                minLen = Math.min(minLen, end - start);
                target += nums[start];
                start++;
            }
        }

        return minLen % (len + 1);
    }
}
