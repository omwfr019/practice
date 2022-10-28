public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node (int d) {
            value = d;
            next = null;
        }
    }

    static void printList(LinkedList list) {
        Node crntNode = list.head;

        while (crntNode != null) {
            System.out.print(crntNode.value + " ");
            crntNode = crntNode.next;
        }

        System.out.println();
    }

    static LinkedList insertNode(LinkedList list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        }
        else {
            Node lastNode = list.head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return list;
    }

    static LinkedList deleteByKey(LinkedList list, int key) {
        Node crntNode = list.head;
        Node prevNode = null;

        if (crntNode != null && crntNode.value == key) {
            list.head = crntNode.next;
            return list;
        }

        while (crntNode != null) {
            if (crntNode.value == key) {
                prevNode.next = crntNode.next;
                return list;
            }

            prevNode = crntNode;
            crntNode = crntNode.next;
        }

        return list;
    }

    static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node crntNode = list.head;
        Node prevNode = null;
        int counter = 0;

        if (crntNode != null && index == 0) {
            list.head = crntNode.next;
            return list;
        }

        while (crntNode != null && counter <= index) {
            if (counter == index) {
                prevNode.next = crntNode.next;
                return list;
            }

            prevNode = crntNode;

            if (crntNode.next != null) {
                crntNode = crntNode.next;
            }

            counter++;
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insertNode(list, 0);
        insertNode(list, 1);
        insertNode(list, 2);
        insertNode(list, 3);
        insertNode(list, 4);
        insertNode(list, 5);
        printList(list);

        deleteAtPosition(list, 0);
        deleteAtPosition(list, 3);
        printList(list);

        deleteByKey(list, 2);
        deleteByKey(list, 5);
        printList(list);
    }
}
