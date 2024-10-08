class m3a4q2{
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }}
        void add(int d){
            node n=new node(d);
            if(head==null)head=n;
            else{
                node temp=head;
                while(temp.next!=null)
                {temp=temp.next;}
                temp.next=n;
            }
        }
        void rev(){
            node prev=null,curr=head,ftr;
          
            while(curr!=null){
                ftr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=ftr;
            }
            head=prev;

        }
        void print(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    
    public static void main(String [] args){
        m3a4q2 l=new m3a4q2();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        l.rev();
        l.print();

    }
}