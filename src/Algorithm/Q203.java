package Algorithm;

public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = head, cur = head;
        if(head.next == null){
            return null;
        }else{
            cur = cur.next;
            while (cur != null) {
                if(cur.val == val){
                    pre.next = cur.next;
                }else{
                    pre = pre.next;
                }
                cur = pre.next;
            }
            if(pre.val == val){
                return null;
            }
        }
        //如果链表头的元素与val相等则将比头指针后移一位
        if(head.val == val){
            head = head.next;
        }
        return head;
    }
}
