class m3a4q4 {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert new node at the end of the list
    void insert(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    // Print all nodes
    void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to merge two sorted linked lists
    node merge(node l1, node l2) {
        // Create a dummy node to start the merged list
        node dummy = new node(-1);
        node current = dummy;

        // Traverse both lists and add the smaller node to the merged list
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in l1 or l2, append them to the merged list
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }

        // Return the merged list, skipping the dummy node
        head=dummy;
        head=head.next;
        return head;
    }

    public static void main(String[] args) {
        m3a4q4 list1 = new m3a4q4();
        m3a4q4 list2 = new m3a4q4();

        // Insert elements into List1
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        // Insert elements into List2
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        // Merge both lists
        m3a4q4 mergedList = new m3a4q4();
        mergedList.head = mergedList.merge(list1.head, list2.head);

        // Print the merged list
        System.out.print("Merged List = ");
        mergedList.print();
    }
}
