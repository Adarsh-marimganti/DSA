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
public class ReverseALinkedList{
    public static ListNode reverse(ListNode n){
        ListNode prev=null;
        while(n!=null){
            ListNode next=n.next;
            n.next=prev;
            prev=n;
            n=next;
        }
        return prev;
    }
    public static void main(String[] args){
        //reverse a linkedlist
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
        dummy=reverse(dummy);
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }
    }
}