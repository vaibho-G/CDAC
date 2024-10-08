class m3a3q6{
    int size=10;
    int front,rear;
    int []arr=new int [size];
m3a3q6(){
    front=0;
    rear=0;

}

    void enqueue(int data){
        if(rear>=size){
          System.out.println("limit reached");
        return;
        }
        else{ arr[rear]=data;
            rear++;}
        
       
    }
        void dequeu(){
            if(rear<0){
                System.out.println("empty queue");
                return;
            }
            else{
                for(int i=0;i<rear-1;i++){
                    arr[i]=arr[i+1];
                }
                rear--;
            }
        }
    void print(){
        for(int i=0;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
   int getfront(){
    if(rear>=0){
    return arr[front];}
    else return -1;
   }
   int getrear(){
    if(rear>=0){
    return arr[rear];}
   else return -1;
   }
    
    public static void main( String [] args){
        m3a3q6 q =new m3a3q6();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        
        q.dequeu();
        q.dequeu();
        q.dequeu();
        q.dequeu();
       System.out.println( q.getfront());
       System.out.println( q.getrear());

        

        q.print();
    }
}