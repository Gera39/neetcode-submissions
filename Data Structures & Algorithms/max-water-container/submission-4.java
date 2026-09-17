class Solution {
    public int maxArea(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int res = 0;
        while (l < r) {
            int area = Math.min(nums[l], nums[r]) * (r - l);
            res = Math.max(res, area);
            if (nums[l] < nums[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}