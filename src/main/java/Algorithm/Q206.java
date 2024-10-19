package Algorithm;

/*
    暴力递归
 */
public class Q206 {
    int cnt = 0;
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode back = reverseList(head.next);
        ListNode temp = back;
        int i = cnt;
        cnt++;
        while(i > 0){
            temp = temp.next;
            i--;
        }
        temp.next = head;
        temp.next.next = null;
        return back;
    }

//    public static void main(String[] args) {
//        ListNode listNode = new ListNode();
//        ListNode head = listNode;
//        for(int i = 1;i <= 2;i++){
//            listNode.next = new ListNode(i);
//            listNode = listNode.next;
//        }
//        head = reverseList(head.next);
//    }
}
