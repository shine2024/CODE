    class Node{
        int data;
        Node next;
        public Node(int data) {
        this.data=data;
        this.next=null;
        }

    }


    class LinkedList{
    static Node head;
    
        //insert at the beginning

        public void insertAtBeginning(int data){
        Node newNode=new Node(data);

        if(head.next==null){
            head.data=newNode;
            head.next=null;
        }else{
        Node temp=head;
        head=newNode;
        head.next=temp;
        }
        }

        public static void print(){
            Node temp=head;
            
            while(temp !=null){
                System.out.print(temp.data +" ");
                temp = temp.next; 
            }
        }
    }

    public class Main{
        public static void main(String[] args) {
            LinkedList l=new LinkedList();
        l.insertAtBeginning(2);
    l.insertAtBeginning(1);
    l.print();
        
        }
    }