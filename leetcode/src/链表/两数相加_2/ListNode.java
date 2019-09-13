package 链表.两数相加_2;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0); // root.next指向新链表
        int flag = 0; // 进位标志
        ListNode cur = root; // 当前位置指向root
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + flag;
            ListNode newNode = new ListNode(sum % 10);
            flag = sum / 10; // 超过10则进1，否则为0
            cur.next = newNode;
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (flag > 0) {
            // 如果最后还有进位，添加一个新节点
            cur.next = new ListNode(flag);
        }
        return root.next;
    }
}
