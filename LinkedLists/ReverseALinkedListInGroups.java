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
public class ReverseALinkedListInGroups{
    public static ListNode reverseInGroups(ListNode head,int k){
        ListNode prev=null;
        ListNode next=null;
        ListNode n=head;
        int c=0;
        while(n!=null && c<k){
            next=n.next;
            n.next=prev;
            prev=n;
            n=next;
            c++;
        }
        if(next!=null)
            head.next=reverseInGroups(next,k);
        return prev;
    }
    public static void main(String[] args){
        //reverse a linkedlist in groups
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        ListNode nn=new ListNode();
        ListNode dummy=nn;
        for(int i=0;i<n;i++){
            nn.next=new ListNode(a[i]);
            nn=nn.next;
        }
        dummy=dummy.next;
        dummy=reverseInGroups(dummy,k);
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }
    }
}