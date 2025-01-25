class Solution {
    public int[] twoSum(int[] nums, int target) {
        // bruteforce solution would be taking 2 loops
        // where looping each integer with other integers to compare with the target
        // TC: O(n*n)
        // SC: O(1)
        // for(int i=0; i<nums.length; i++){
        // for(int j=i+1; j<nums.length; j++){
        // if(nums[i] + nums[j] == target){
        // return new int[]{i, j};
        // }
        // }
        // }

        // return new int[]{};

        // Optimal Solution
        // TC: O(n)
        Map<Integer, Integer> map = new HashMap<>();
        int diff;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(nums[i], i);
        }
        return new int[] {};

    }
}