

class MyStack{
  
  int arr[];
  int cap;
  int top;

    public MyStack(int c) {
        top=-1;
        cap=c;
        arr=new int[c];
    }

void push(int n){
    if(isFull()){
    System.err.println("stack is full");
    }else{
         top++;
    arr[top]=n;
    }
   
}
  
void  pop(){
    int sub=-1;
     if(isEmpty()){
    System.err.println("stack is empty");
   
    }else{
       sub=arr[top];
    top--;
    //print();
    }
   System.err.println("pop"+" "+sub); 
//    print();
}

int size(){
    return top+1;
}

boolean isEmpty(){
      return (top==-1);
}

boolean isFull(){
    return (top==cap-1);
}

void  print(){
    System.out.println("");
    for(int i=0;i<=top;i++){
     System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
    MyStack s=new MyStack(4);
    // s.pop();
    s.push(1);
    s.print();
    s.push(2);
    s.push(3);
    s.push(4);
    s.print();
    s.pop();
    s.print();
   s.push(3);
    s.print();
   s.push(9);
    s.print();
}
}

