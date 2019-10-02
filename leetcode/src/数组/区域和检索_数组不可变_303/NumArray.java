package 数组.区域和检索_数组不可变_303;

public class NumArray {

    private int[] sum; // sum[i]存储前i个元素和，sum[0] = 0，sum[i]存储nums[0...i-1]的和

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

}
