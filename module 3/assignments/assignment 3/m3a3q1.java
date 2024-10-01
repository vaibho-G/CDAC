class m3a3q1{

   int [] arr=new int[10];
   int top;
    m3a3q1(){
        top=-1;
    }
   void push(int a){
    if(top<=9)
    top++;
    arr[top]=a;
    
    }
    int pop(){
        if(top!=-1){
        int temp=top;
        top--;
        return arr[temp];}
        else 
        {System.out.println("its empty");
        return -1;}
    }

    int peek(){
        if(isempty()) return -1;
        else return arr[top];
    }

    boolean isempty(){
        if(top==-1) {System.out.println("its empty"); return true;}
        else {System.out.println("its not empty"); return false;}
    }

    boolean isfull(){
        if(top==9) {System.out.println("its full"); return true;}
        else {System.out.println("its not full"); return false;}
    }

    public static void main(String [] args){
        m3a3q1 s=new m3a3q1();
        s.isempty();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.isfull();
        s.pop();
        System.out.println(s.peek());
    }
}