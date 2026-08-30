class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Product of elements to the left
        int left = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        // Product of elements to the right
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}