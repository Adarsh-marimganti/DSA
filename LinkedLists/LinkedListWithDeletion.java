import java.util.*;
class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node first;
    LinkedList(){
        first=null;
    }
    void insert(int position,String data){
        Node newnode=new Node(data);
        if(first==null){
            first=newnode;
        }
        else if(position==0){
            newnode.next=first;
            first=newnode;
        }
        else{
            Node tempnode=first;
            for(int i=0;i<position-1;i++){
                tempnode=tempnode.next;
            }
            newnode.next=tempnode.next;
            tempnode.next=newnode;
        }
    }
    void delete(int position){
        if(position==0){
            first=first.next;
        }
        else{
            Node tempnode=first;
            Node prev;
        for(int i=0;i<position-1;i++){
            tempnode=tempnode.next;
        }
        prev=tempnode;
        prev.next=tempnode.next.next;
        }
    }
    void print(){
        Node temp=first;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.print(temp.data);
        System.out.println("");
    }
    
       
}
public class LinkedListWithDeletion{
    public static void main(String[] args){
        //LinkedList with Deletion
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList list=new LinkedList();
        for(int i=0;i<n;i++) list.insert(i,sc.next());
        list.delete(3);
        list.print();
    }
}