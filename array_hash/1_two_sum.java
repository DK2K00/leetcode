class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nm = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (nm.containsKey(complement)) {
                return new int[]{nm.get(complement), i};
            }
            nm.put(nums[i], i);
        }

        return new int[]{}; 
    }
}