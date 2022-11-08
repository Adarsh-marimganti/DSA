import java.io.*;
import java.util.*;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Heap{
    ArrayList<ListNode> a;
    int heapSize;
    Heap(){
        a= new ArrayList<>();
        a.add(null);
        heapSize=0;
    }
    void percolateTopToBottom(int idx){
        int l=2*idx;
        int r=2*idx+1;
        if(l>heapSize) return;
        if(l==heapSize){
            if(a.get(l).val<a.get(idx).val){
                ListNode t=a.get(l);
                a.set(l,a.get(idx));
                a.set(idx,t);
            }
        }
        else{
            if(a.get(l).val<a.get(r).val){
                ListNode t=a.get(l);
                a.set(l,a.get(idx));
                a.set(idx,t);
                percolateTopToBottom(l);
            }
            else{
                ListNode t=a.get(r);
                a.set(r,a.get(idx));
                a.set(idx,t);
                percolateTopToBottom(r);
            }
        }
        
    }
    void percolateBottomToTop(int idx){
        int parent=idx/2;
        if(parent<1) return;
        if(a.get(parent).val>a.get(idx).val){
            ListNode t=a.get(parent);
            a.set(parent,a.get(idx));
            a.set(idx,t);
        }
        percolateBottomToTop(parent);
    }
    void insert(ListNode ele){
        a.add(ele);
        heapSize++;
        percolateBottomToTop(heapSize);
        System.out.println("Inserted Successfully");
    }
    ListNode getMin(){
        return a.get(1);
    }
    void printLevelOrder(){
        for(int i=1;i<=heapSize;i++) System.out.print(a.get(i).val+" ");
    }
    ListNode extractMin(){
        ListNode e=a.get(1);
        a.set(1,a.get(heapSize));
        a.remove(a.size()-1);
        heapSize--;
        percolateTopToBottom(1);
        return e;
    }
    boolean isEmpty(){
        if(heapSize==0) return true;
        return false;
    }
}
public class MergeKSortedLists{
    public static ListNode mergeKSortedLists(ListNode[] lists){
        Heap h=new Heap();
        ListNode ans=new ListNode();
        ListNode dummy=ans;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
            h.insert(lists[i]);
            lists[i]=lists[i].next;
            }
        }
        while(!h.isEmpty()){
            ListNode cur=h.extractMin();
            ans.next=cur;
            ans=ans.next;
            cur=cur.next;
            if(cur!=null) h.insert(cur);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        //merge k sorted lists
        //Using MinHeap
        //O(n*logk),O(k)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ListNode[] lists=new ListNode[n];
        for(int t=0;t<n;t++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            ListNode nn=new ListNode(e);
            ListNode p=nn;
            for(int i=1;i<s;i++){
                nn.next=new ListNode(sc.nextInt());
                nn=nn.next;
            }
            lists[t]=p;
        }
        ListNode ans=mergeKSortedLists(lists);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
        // for(int i=0;i<n;i++){
        //     ListNode nn=lists[i];
        //     while(nn!=null){
        //         System.out.print(nn.val+" ");
        //         nn=nn.next;
        //     }
        //     System.out.println();
        // }
    }
    
}