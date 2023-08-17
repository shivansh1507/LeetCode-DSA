import java.util.Scanner;

public class Addlast {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;
    }

    void addLast(LinkedList list, int val) {
        if (list.size == 0) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            list.head = list.tail = temp;
            list.size++;
        } else {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;
            list.tail.next = newNode;
            list.tail = newNode;
            list.size++;
        }
    }

    public void remove(LinkedList list) {
        if (list.size == 0) {
            System.out.println("List is empty");
        } else if (list.size == 1) {
            list.head = list.tail = null;
            list.size = 0;
        } else {
            list.head = list.head.next;
            list.size--;
        }
    }

    public static void main(String[] args) {
        Addlast addLastObj = new Addlast();
        LinkedList list = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            addLastObj.addLast(list, element);
        }

        System.out.println("Elements in the linked list:");
        addLastObj.remove(list);
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
