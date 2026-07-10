package Linked_List;

////create a Node--------
//
//class Node{
//    int val;
//
//    Node next;
//
//    Node(int val ){
//        this.val=val ;
//    }
//
//}
public class Basic {
    public static void main(String[] args) {
        //Create the Node Value--------
        //10 20 30 40 50
//        Node a = new Node();
//        a.val=10;
//        Node b = new Node();
//        b.val=20;
//        Node c = new Node();
//        c.val=30;
//        Node d = new Node();
//        d.val=40;
//        Node e = new Node();
//        e.val=50;
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

//        System.out.println(a.val);
//        System.out.println(b.val);
//        System.out.println(e.val);

        //Connect Karna hai(Linked karna hai next address se----
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // ab yahsa ho gya hai ki-----
        //10->20->30->40->50

//        System.out.println(a);  //Reference Print Hoga-------Linked_List.Node@6acbcfc0
//        System.out.println(b);  //Linked_List.Node@5f184fc6
//        System.out.println(a.next);  //Linked_List.Node@5f184fc6 dono same hoga
//        System.out.println(c);
//        System.out.println(b.next);
        System.out.println(c); //Linked_List.Node@6acbcfc0
        System.out.println(b.next); //Linked_List.Node@6acbcfc0
        System.out.println(a.next.next); //Linked_List.Node@6acbcfc0

        System.out.println(a.next.next.next.val); //40


    }
}
