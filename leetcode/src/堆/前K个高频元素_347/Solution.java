package 堆.前K个高频元素_347;

import java.util.*;

public class Solution {

//    private class Freq implements Comparable<Freq> {
//
//        public int e, freq;
//
//        public Freq(int e, int freq) {
//            this.e = e;
//            this.freq = freq;
//        }
//
//        @Override
//        public int compareTo(Freq other) {
//            return this.freq - other.freq;
//        }
//    }
//
//    public List<Integer> topKFrequent(int[] nums, int k) {
//
//        // 使用map统计元素及其频率
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            } else {
//                map.put(num, 1);
//            }
//        }
//        PriorityQueue<Freq> pq = new PriorityQueue<>();
//        for (int key : map.keySet()) {
//            if (pq.size() < k) {
//                pq.add(new Freq(key, map.get(key)));
//            } else if (map.get(key) > Objects.requireNonNull(pq.peek()).freq) {
//                pq.remove();
//                pq.add(new Freq(key, map.get(key)));
//            }
//        }
//        List<Integer> list = new ArrayList<>();
//        while (!pq.isEmpty()) {
//            list.add(pq.remove().e);
//        }
//        return list;
//    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.remove());
        }
        return list;
    }
}