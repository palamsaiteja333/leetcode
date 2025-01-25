class Solution {
    public int missingNumber(int[] nums) {

        // bruteforce solution
        // TC: O(nlogn)
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;

    }
}