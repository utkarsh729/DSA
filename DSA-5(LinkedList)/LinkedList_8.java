// Loop detection in linkedList

public class LinkedList_8 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void insertAtEnd(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    //Floyd's cycle detection algorithm  or hare-tortoise algorithm
    public void detectLoop(){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("Loop detected");
                return;
            }
        }
        System.out.println("Loop not detected");
    }
    public static void main(String[] args) {
        LinkedList_8 obj=new LinkedList_8();

        obj.insertAtEnd(2);
        obj.insertAtEnd(4);
        obj.insertAtEnd(6);
        obj.insertAtEnd(8);

        obj.display();
        System.out.println("Before creating loop: ");
        obj.detectLoop();

        //circular linked list
        Node temp=obj.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=obj.head;

        System.out.println();
        System.out.println("After creating loop ");
        obj.detectLoop();




    }
    
}
