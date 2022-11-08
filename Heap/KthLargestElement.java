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
    int getMax(){
        return a.get(1)*-1;
    }
    void printLevelOrder(){
        for(int i=1;i<=heapSize;i++) System.out.print(-1*a.get(i)+" ");
    }
    int extractMax(){
        int e=a.get(1);
        a.set(1,a.get(heapSize));
        a.set(heapSize,0);
        heapSize--;
        percolateTopToBottom(1);
        return e*-1;
    }
}
public class KthLargestElement{
    public static void main(String[] args) {
        //Kth largest element
        //Using MaxHeap
        //O(logn+k*logn)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Heap h=new Heap();
        for(int i=0;i<n;i++){
            h.insert(-1*sc.nextInt());
        }
        while(k-->1){
            h.extractMax();
        }
        System.out.println(h.getMax());
    }
}