import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PartitionofList {
    public static Node partitionList(Node head, int x) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node curr1 = dummy1;
        Node curr2 = dummy2;
        Node curr = head;
        while (curr != null) {
            if (curr.val < x) {
                curr1.next = curr;
                curr1 = curr1.next;
            } else {
                curr2.next = curr;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        curr2.next = null;
        curr1.next = dummy2.next;
        return dummy1.next;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = sc.nextInt();
        Node head = new Node(Integer.parseInt(input[0]));
        Node curr = head;
        for (int i = 1; i < input.length; i++) {
            if (Integer.parseInt(input[i]) == -1) {
                break;
            }
            curr.next = new Node(Integer.parseInt(input[i]));
            curr = curr.next;
        }
        head = partitionList(head, x);
        printList(head);
    }
}
