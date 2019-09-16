package 数组.两个数组的交集_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for (int num : nums1) {
//            list1.add(num);
//        }
//        for (int num : nums2) {
//            if (list1.contains(num)) {
//                list2.add(num);
//                list1.remove(Integer.valueOf(num));
//            }
//        }
//        int[] arr = new int[list2.size()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = list2.get(i);
//        }
//        return arr;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }
}
