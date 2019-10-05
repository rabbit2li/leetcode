package 数组.最长连续序列_128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        int longestSeq = 0;
//        int curSeq = 1;
//
//        Arrays.sort(nums);
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                if (nums[i] == nums[i - 1] + 1) {
//                    curSeq += 1;
//                } else {
//                    longestSeq = Math.max(longestSeq, curSeq);
//                    curSeq = 1;
//                }
//            }
//        }
//        return Math.max(longestSeq, curSeq);
//    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSeq = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curSeq = 1;

                while (set.contains(curNum + 1)) {
                    curNum += 1;
                    curSeq += 1;
                }
                longestSeq = Math.max(longestSeq, curSeq);
            }
        }
        return longestSeq;
    }
}
