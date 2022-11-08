import java.io.*;
import java.util.*;
class Heap{
    ArrayList<Integer> a;
    int heapSize;
    Heap(){
        a= new ArrayList<>();
        a.add(0);
        heapSize=0;
    }
    void percolateTopToBottom(int idx){
        int l=2*idx;
        int r=2*idx+1;
        if(l>heapSize) return;
        if(l==heapSize){
            if(a.get(l)<a.get(idx)){
                int t=a.get(l);
                a.set(l,a.get(idx));
                a.set(idx,t);
            }
        }
        else{
            if(a.get(l)<a.get(r)){
                int t=a.get(l);
                a.set(l,a.get(idx));
                a.set(idx,t);
                percolateTopToBottom(l);
            }
            else{
                int t=a.get(r);
                a.set(r,a.get(idx));
                a.set(idx,t);
                percolateTopToBottom(r);
            }
        }
        
    }
    void percolateBottomToTop(int idx){
        int parent=idx/2;
        if(parent<1) return;
        if(a.get(parent)>a.get(idx)){
            int t=a.get(parent);
            a.set(parent,a.get(idx));
            a.set(idx,t);
        }
        percolateBottomToTop(parent);
    }
    void insert(int ele){
        a.add(ele);
        heapSize++;
        percolateBottomToTop(heapSize);
        System.out.println("Inserted Successfully");
    }
    int getMin(){
        return a.get(1);
    }
    void printLevelOrder(){
        for(int i=1;i<=heapSize;i++) System.out.print(a.get(i)+" ");
    }
    int extractMin(){
        int e=a.get(1);
        a.set(1,a.get(heapSize));
        a.set(heapSize,0);
        heapSize--;
        percolateTopToBottom(1);
        return e;
    }
}
public class DynamicMinHeap{
    public static void main(String[] args) {
        //implementing a heap
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Heap h=new Heap();
        for(int i=0;i<n;i++){
            System.out.println("Enter data to store in MinHeap");
            h.insert(sc.nextInt());
            //h.printLevelOrder();
            System.out.println();
        }
        //get minimum element
        System.out.println(h.getMin());
        //printing heap in level order
        h.printLevelOrder();
        System.out.println();
        //delete smallest element
        System.out.println(h.extractMin());
        //after extracting the minimum element
        h.printLevelOrder();
        
            
    }
    
}