// This is the solution for leetcode problem number 141, please find the link below
// https://leetcode.com/problems/linked-list-cycle/
public class DetectACycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}