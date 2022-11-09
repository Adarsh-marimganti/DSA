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
public class isListAPalindrome{
    public static ListNode middle(ListNode n){
        ListNode slow=n;
        ListNode fast=n;
        //when n is even return the lower bound of middle two elements
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
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
    public static boolean isPalindrome(ListNode n){
        ListNode m=middle(n);
        m=m.next;
        m=reverse(m);
        while(n!=null && m!=null){
            if(n.val!=m.val) return false;
            n=n.next;
            m=m.next;
        }
        return true;
    }
    public static void main(String[] args){
        //to check if a linkedlist is a palindrome
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
        if(isPalindrome(dummy)) System.out.println("Given list is a palindrome");
        else System.out.println("Given list is not a palindrome");
    }
}