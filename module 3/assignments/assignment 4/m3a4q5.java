class m3a4q5 {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

 
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

    
    void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    void removeDuplicates() {
        node current = head;

     
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
              
                current.next = current.next.next;
            } else {
               
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        m3a4q5 list1 = new m3a4q5();
        list1.insert(1);
        list1.insert(1);
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(3);
        list1.insert(4);

        System.out.print("Original List 1 = ");
        list1.print();

        list1.removeDuplicates();

        System.out.print("After Removing Duplicates from List 1 = ");
        list1.print();

        // Test Case 2
        m3a4q5 list2 = new m3a4q5();
        list2.insert(7);
        list2.insert(7);
        list2.insert(8);
        list2.insert(9);
        list2.insert(9);
        list2.insert(10);

        System.out.print("Original List 2 = ");
        list2.print();

        list2.removeDuplicates();

        System.out.print("After Removing Duplicates from List 2 = ");
        list2.print();
    }
}
