class m3a4q3{
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next =null;
        }
    }
    void addFirst(int d){
        node n= new node(d);
        if(head==null)head=n;
        else{
            n.next=head;
            head=n;
        }
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
}  
void cycle(){
    node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    node n=head.next;
    temp.next=n;
}
void detectC(){
    node fast=head,slow=head;
    while(fast.next!=null|| fast!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){ 
            System.out.println("decteted"); 
          break;}
    }
}
     public static void main(String [] args){
        m3a4q3 l=new m3a4q3();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.print();
        l.cycle();
        l.detectC();

    }

}