package Algorithm;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Q21 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Solution {
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            while(!(list1 == null && list2 == null)){
                //当其中一条链表指针遍历到空结点时，直接指向另一条链表的当前位置
                if(list1 == null){
                    p.next = list2;
                    return listNode.next;
                }
                if(list2 == null){
                    p.next = list1;
                    return listNode.next;
                }
                //比较当前结点大小
                if(list1.val < list2.val){
                    p.next = list1;
                    p = p.next;
                    list1 = list1.next;
                }else {
                    p.next = list2;
                    p = p.next;
                    list2 = list2.next;
                }
            }
            return listNode.next;
        }
    }
}
