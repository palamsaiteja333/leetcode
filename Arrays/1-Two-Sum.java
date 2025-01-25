class Solution {
    public int[] twoSum(int[] nums, int target) {
        // bruteforce solution would be taking 2 loops
        // where looping each integer with other integers to compare with the target
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
        // Map<Integer, Integer> map = new HashMap<>();

        
    }
}