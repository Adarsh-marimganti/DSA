import java.io.*;
import java.util.*;
class Heap{
    int[] a;
    int heapSize;
    Heap(int n){
        a=new int[n+1];
        heapSize=0;
    }
    void percolateTopToBottom(int idx){
        int l=2*idx;
        int r=2*idx+1;
        if(l>heapSize) return;
        if(l==heapSize){
            if(a[l]<a[idx]){
                int t=a[l];
                a[l]=a[idx];
                a[idx]=t;
            }
        }
        else{
            if(a[l]<a[r]){
                int t=a[l];
                a[l]=a[idx];
                a[idx]=t;
                percolateTopToBottom(l);
            }
            else{
                int t=a[r];
                a[r]=a[idx];
                a[idx]=t;
                percolateTopToBottom(r);
            }
        }
        
    }
    void percolateBottomToTop(int idx){
        int parent=idx/2;
        if(parent<1) return;
        if(a[parent]>a[idx]){
            int t=a[parent];
            a[parent]=a[idx];
            a[idx]=t;
        }
        percolateBottomToTop(parent);
    }
    void insert(int ele){
        a[heapSize+1]=ele;
        heapSize++;
        percolateBottomToTop(heapSize);
        System.out.println("Inserted Successfully");
    }
    int getMin(){
        return a[1];
    }
    void printLevelOrder(){
        for(int i=1;i<=heapSize;i++) System.out.print(a[i]+" ");
    }
    int extractMin(){
        int e=a[1];
        a[1]=a[heapSize];
        a[heapSize]=0;
        heapSize--;
        percolateTopToBottom(1);
        return e;
    }
}
public class MinHeap{
    public static void main(String[] args) {
        //implementing a Min heap
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Heap h=new Heap(n);
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