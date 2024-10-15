package Algorithm;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Q2 {
    class Solution {
        public static class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode(0);
            ListNode cur = pre;
            int carry = 0;
            while (l1 != null || l2 != null || carry == 1) {
                if (l1 == null) {
                    l1 = new ListNode(0);
                }
                if (l2 == null) {
                    l2 = new ListNode(0);
                }
                if ((l1.val + l2.val + carry) >= 10) {
                    cur.next = new ListNode((l1.val + l2.val + carry) % 10);
                    carry = 1;
                } else {
                    cur.next = new ListNode(l1.val + l2.val + carry);
                    carry = 0;
                }
                cur = cur.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            return pre.next;
        }
    }
}