public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_Node = new_Node(data);
        if (list.head == null) {
            list.head = new_Node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_Node;
        }
        return list;
    }
            public
}
