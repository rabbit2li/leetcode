package 数组.最接近的三数之和_16;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {

        if (nums == null || nums.length < 3) {
            return -1;
        }
        int tmp = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(tmp - target)) {
                    tmp = sum;
                }
                if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    return sum;
                }
            }
        }
        return tmp;
    }
}
