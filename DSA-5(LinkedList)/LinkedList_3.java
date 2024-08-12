import java.util.Scanner;

public class LinkedList_3{
    Node head;
    class Node{
        int data;
        Node nxt;
        Node(int data){
            this.data=data;
            nxt=null;
        }
    }

    //insert at position
    public void insertAtPosition(int data,int pos){
        Node newNode=new Node(data);

        int count=0;
        // Node nxtNode=head;
        Node prevNode=head;
        while(count<pos-2)
        //while(count<pos-1)
        {
            prevNode=prevNode.nxt;
            // prevNode=nxtNode;
            // nxtNode=nxtNode.nxt;
            count++;
        }
        newNode.nxt=prevNode.nxt;
        prevNode.nxt=newNode;

        // newNode.nxt=nxtNode;
        // prevNode.nxt=newNode;

    }

    // insert after node
    public void insertAfterNode(Node prevNode,int data){
        Node newNode=new Node(data);
        if(prevNode==null){
            System.out.println("the previous node cannot contain a null value");
            return;
        }
        newNode.nxt=prevNode.nxt;
        prevNode.nxt=newNode;
        
    }


    public void insertAtEnd(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=new Node(data);
            //or
            //head=newnode;
            return;
        }

        Node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        temp.nxt=newNode;
        return;
    }
    public void display(){
        Node curr=head;
        if(curr==null){
            System.out.println("Linked List is empty");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.nxt;
        }
    }

    public static void main(String[] args) {
        LinkedList_3 obj=new LinkedList_3();
        obj.display();
        obj.insertAtEnd(2);
        obj.insertAtEnd(10);
        obj.insertAtEnd(5);
        obj.insertAtEnd(8);
        obj.insertAtEnd(99);

        obj.display();
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data: ");
        int data=sc.nextInt();
        System.out.println("Enter the position at which you want to store data: ");
        int pos=sc.nextInt();

        obj.insertAtPosition(data, pos);

        obj.display();
        System.out.println();

        obj.insertAfterNode(obj.head.nxt.nxt.nxt,4);
        obj.display();

        sc.close();
    }

}