import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class SortedLinkedList {
    Node head;
    void insertInSortedPosition(Node newNode) {
        if(head==null){
            head=newNode;
        }
        else if(head.data > newNode.data){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node tempNode = head;
            while(tempNode.next != null && tempNode.next.data < newNode.data){
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }
    void print() {
        Node temp=head;
        while(temp.next!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println("");
    }
}
public class LinkedListWithDeletion{
    public static void main(String[] args){
        //LinkedList which is always sorted
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SortedLinkedList list=new SortedLinkedList();
        for(int i=0;i<n;i++) list.insertInSortedPosition(new Node(sc.nextInt()));
        
        list.print();
    }
}