package 链表.合并两个有序链表_21;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0); // 增加一个虚拟节点
        ListNode cur = root; // 当前位置指向虚拟节点

        // 类似于归并排序的合并
        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            int val2 = l2.val;
            if (val1 <= val2) {
                cur.next = new ListNode(val1);
                l1 = l1.next;
            } else {
                cur.next = new ListNode(val2);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while (l1 != null) {
            cur.next = new ListNode(l1.val);
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            cur.next = new ListNode(l2.val);
            l2 = l2.next;
            cur = cur.next;
        }

        return root.next;
    }
}
