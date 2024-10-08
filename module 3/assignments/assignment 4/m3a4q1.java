class m3a4q1{
    node head;
    class node{
        int data;
        node next;
        node(int data){
        this.data=data;
        next=null;
        }
    }
    void insert(int data){
        node n=new node(data);
        if(head==null) head=n;
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void delet(int da){
        node temp=head;
        while (temp.next != null) {
            if (temp.next.data == da) {
                temp.next = temp.next.next; // Skip the node to delete
                return; // Return after deletion to avoid unnecessary traversal
            }
            temp = temp.next; // Move to the next node
        }
    }
    public static void main(String [] args){
        m3a4q1 l= new m3a4q1();
        l.insert(10);
        l.insert(11);
        l.insert(12);
        l.delet(11);
        l.print();
    }
}
