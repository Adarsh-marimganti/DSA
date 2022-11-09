import java.io.*;
import java.util.*;
class Node{
    Node next;
    int data;
    Node(int x){
        data=x;
        next=null;
    }
}
public class MaxPairSum{
    public static Node getMedian(Node nn){
        Node slow=nn;
        Node fast=nn;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node nn){
        Node prev=null;
        while(nn!=null){
            Node next=nn.next;
            nn.next=prev;
            prev=nn;
            nn=next;
        }
        return prev;
    }
    public static int getMaxPair(Node nn){
        Node m=getMedian(nn);
        m=reverse(m);
        // while(m!=null){
        //     System.out.print(m.data+" ");
        //     m=m.next;
        // } 
        // System.out.println();
        // while(nn!=null){
        //     System.out.print(nn.data+" ");
        //     nn=nn.next;
        // } 
        int max=Integer.MIN_VALUE;
        while(nn!=null && m!=null){
            max=Math.max((nn.data+m.data),max);
            nn=nn.next;
            m=m.next;
        }
        return max;
    }
    public static void main(String[] args) {
        //Give a linked list, which has even number of nodes, please return the maximum sum of PAIR
        //A pair means the node[i] and node[n-i], which n is linked list length.
        //O(n/2)+O(n/2)+O(n/2), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node nn=new Node(sc.nextInt());
        Node dummy=nn;
        for(int i=1;i<n;i++){
            nn.next=new Node(sc.nextInt());
            nn=nn.next;
        }
        int ans=getMaxPair(dummy);
        System.out.println(ans); 
    }
    
}