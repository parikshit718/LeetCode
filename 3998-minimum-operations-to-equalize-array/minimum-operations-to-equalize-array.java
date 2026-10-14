
class Solution {
    public int minOperations(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            if (nums[i]!= nums[0]) {
                return 1;
            }
        }
        return 0;
    }
}
