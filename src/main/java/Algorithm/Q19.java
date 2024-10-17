package Algorithm;

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode back = head;
        for(int i = 0;i < n;i++){
            if(i != n - 1 && cur.next == null){
                head = head.next;
                return head;
            }
            cur = cur.next;
        }
        while(cur.next != null){
            cur = cur.next;
            back = back.next;
        }
        back.next = back.next.next;
        return head;
    }
}
