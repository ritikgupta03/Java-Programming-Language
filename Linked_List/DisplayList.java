package Linked_List;
//create a Node--------

import static java.lang.reflect.Array.get;

//class Node{
//    int val;
//
//    Node next;
//
//    Node(int val ){
//        this.val=val ;
//        //this.next=null;
//    }
//
//}

public class DisplayList {
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }

    public static void display(Node head){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp= temp.next;

        }
        System.out.println();
//        for(Node temp1=head; temp1!=null; temp1=temp.next){
//            System.out.println(temp1.val);
//        }

//        System.out.print(head.val+"->");
//        System.out.print(head.next.val+"->");
//        System.out.print(head.next.next.val+"->");
//        System.out.print(head.next.next.next.val+"->");
//        System.out.print(head.next.next.next.next.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(302);
        Node d = new Node(401);
        Node e = new Node(505);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //display(a);
        displayRec(a);
      System.out.println(get(a,2));
    }


}
