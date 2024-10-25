class L_Node {
    int data;
    L_Node next;

    public L_Node(int data) {
        this.data = data;
        this.next = null;
    }

    LinkedList addElement(LinkedList list, int data) {
//        Creating a node
        L_Node newNode = new L_Node(data);

//        checking the head is null then assign newNode to null
        if (list.head == null) {
            list.head = newNode;
        } else {
//            Creating a dummy traversal pointer
            L_Node current = list.head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return list;
    }

    //    for printing the data
    void printList(LinkedList list) {
        L_Node current = list.head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    LinkedList removeElement(LinkedList list, int data) {
        L_Node current = list.head;
        L_Node prev = list.head;
        try {
            while (current.data != data) {
                prev = current;
                current = current.next;
            }
        } catch (NullPointerException e) {
            System.out.println("Data not found");
            return list;
        }

        prev.next = current.next;

        if (current == list.head) {
            list.head = current.next;
        }
        return list;
    }

}


public class LinkedList {
    L_Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new L_Node(1);
        list = list.head.addElement(list, 2);
        list = list.head.addElement(list, 3);
        list = list.head.addElement(list, 4);

        list.head.printList(list);

        list = list.head.removeElement(list, 3);

        list.head.printList(list);

    }
}
