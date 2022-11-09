import java.util.*;
class ListNode{
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int e){
        this.val=e;
        this.next=null;
    }
}
public class MedianOfLinkedList{
    public static ListNode middle(ListNode n){
        ListNode slow=n;
        ListNode fast=n;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        //get middle element of linkedlist
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        ListNode nn=new ListNode();
        ListNode dummy=nn;
        for(int i=0;i<n;i++){
            nn.next=new ListNode(a[i]);
            nn=nn.next;
        }
        dummy=dummy.next;
        ListNode mid=middle(dummy);
        System.out.println(mid.val);
    }
}