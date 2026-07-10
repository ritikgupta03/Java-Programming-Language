package Linked_List;

class Node{
    int val;

    Node next;

    Node(int val ){
        this.val=val ;
        //this.next=null;
    }

}
class LinkedList{
    Node head;
    Node tail;
    int size;

    void addAtHead(int val) {
        Node temp= new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void addAtTail(int val){
        Node temp= new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    void display() {
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void deleteAtHead() {
        if(head==null){
            System.out.print("List is Empty");
            return;
        }
        //delete head----
            head=head.next;
        if(head==null) tail=null;
        size--;
    }

    int search(int val){
        if(head==null) return -1;
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
        //Time Complexity: O(n)

    }

    int get(int idx) {
        Node temp= head;
        for(int i=1; i<=idx; i++){
            temp= temp.next;

        }
        return temp.val;
    }

    void insertAtIndex(int val, int idx) {
        //base case--
        if(idx==0 || idx>size) System.out.println("Invalid Index");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=0; i<=idx-1 ; i++){
                temp=temp.next;
            }
            Node t= new Node(val);
            t.next = temp.next;
            temp.next=t;
            size++;

        }
    }

       void delete(int idx) {
        //base casse----
        if(idx<0 || idx>=size){
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next; //delete-----
        if(idx==size-1) tail=temp; //we are deleting tail-------
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addAtTail(10); //ll.display();
        ll.addAtTail(20); //ll.display();
        ll.addAtTail(30); //ll.display();
        ll.addAtTail(40); //ll.display();
        ll.addAtTail(50); ll.display();

        ll.addAtHead(90); ll.display();

        ll.addAtTail(100); ll.display();

        //head ko delete
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);

        System.out.println(ll.search(50)); //for the search funtion--
        ll.insertAtIndex(45,2);
        ll.display();
        System.out.println(ll.get(4));

        //delete at index--
        ll.delete(4);
        ll.display();




    }
}
