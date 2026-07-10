package Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size;

    // INSERT AT HEAD --------------------------------------------
    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    // INSERT AT TAIL --------------------------------------------
    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);

        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // INSERT AT Kth INDEX --------------------------------------------
    void insertAtKthIndex(int val, int k) {
        if (k < 0 || k > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (k == 0) {
            insertAtHead(val);
            return;
        }

        if (k == size) {
            insertAtTail(val);
            return;
        }

        ListNode temp = new ListNode(val);
        ListNode curr = head;

        for (int i = 0; i < k - 1; i++) {
            curr = curr.next;
        }

        temp.next = curr.next;
        temp.prev = curr;

        curr.next.prev = temp;
        curr.next = temp;

        size++;
    }

    // DELETE AT HEAD --------------------------------------------
    void deleteAtHead() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // DELETE AT TAIL --------------------------------------------
    void deleteAtTail() {
        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // DISPLAY --------------------------------------------
    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // DISPLAY REVERSE --------------------------------------------
    void displayReverse() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);

//        System.out.print("Forward: ");
//        list.display();           // 50 40 30 20 10
//
//        System.out.print("Reverse: ");
//        list.displayReverse();    // 10 20 30 40 50
//
//        list.insertAtTail(5);
//        System.out.print("After insert at tail: ");
//        list.display();
//
////        list.insertAtKthIndex(99, 2);
////        System.out.print("After insert at index 2: ");
////        list.display();
//
//        list.deleteAtHead();
//        System.out.print("After delete head: ");
//        list.display();
//
//        list.deleteAtTail();
//        System.out.print("After delete tail: ");
 //       list.display();
        list.display(); //50 40 30 20 10
        list.insertAtTail(70);
        list.display(); //50 40 30 20 10 70
        list.displayReverse(); //70 10 20 30 40 50
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();
        list.insertAtKthIndex(1,80);
        list.display();

    }
}