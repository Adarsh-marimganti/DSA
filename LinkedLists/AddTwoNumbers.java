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
public class AddTwoNumbers{
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
    public static ListNode addTwoLists(ListNode l1, ListNode l2) {
       ListNode dummy=new ListNode();
       ListNode ans=dummy;
        int carry=0;
        while(l1!=null && l2!=null){
            ans.next=new ListNode((l1.val+l2.val+carry)%10);
            carry=(l1.val+l2.val+carry)/10;
            ans=ans.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null && l2==null){
            ans.next=new ListNode((l1.val+carry)%10);
            carry=(l1.val+carry)/10;
            ans=ans.next;
            l1=l1.next;
        }
        while(l2!=null && l1==null){
            ans.next=new ListNode((l2.val+carry)%10);
            carry=(l2.val+carry)/10;
            ans=ans.next;
            l2=l2.next;
        }
        if(carry!=0) ans.next=new ListNode(carry);
        return dummy.next;
        
    }
    public static void main(String[] args){
        //add two numbers given as linkedlists
        Scanner sc=new Scanner(System.in);
        
        //reading first linkedlist
        int n=sc.nextInt();
        ListNode nn=new ListNode();
        ListNode dummy=nn;
        for(int i=0;i<n;i++){
            nn.next=new ListNode(sc.nextInt());
            nn=nn.next;
        }
        dummy=dummy.next;
        
        //reading second linkedlist
        int m=sc.nextInt();
        ListNode nn2=new ListNode();
        ListNode dummy2=nn2;
        for(int i=0;i<m;i++){
            nn2.next=new ListNode(sc.nextInt());
            nn2=nn2.next;
        }
        dummy2=dummy2.next;
        
        //sum of two lists
        //reverse lists as addition is performed from right to left
        dummy=reverse(dummy);
        dummy2=reverse(dummy2);
        
        ListNode sum=addTwoLists(dummy,dummy2);
        
        sum=reverse(sum);
        
        while(sum!=null){
            System.out.print(sum.val+" ");
            sum=sum.next;
        }
    }
}