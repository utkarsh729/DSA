import java.util.Scanner;

public class LinkedList_4 {
    Node head;
    class Node{
        int data;
        Node nxt;
        Node(int data){
            this.data=data;
        }
    }
    public void insertAtEnd(int data){
        if(head==null){
            head= new Node(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        temp.nxt=newNode;
    }

    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.nxt;
        }
    }

    // Deletion in linked List
    public void deleteNode(int pos){
        if(head==null){
            System.out.println("Linked List is already empty");
            return;
        }
        if(pos==1){
            head=head.nxt;
            return;
        }
        Node prevNode=head;
        Node nextNode=head;
        while(pos>1){
            prevNode=nextNode;
            if(prevNode.nxt==null){
                System.out.println("List is smaller then entered position  .... .... CAN'T DELETE");
                return;
            }
            nextNode=nextNode.nxt;
            pos--;
        }
        prevNode.nxt=nextNode.nxt;  
    }

    public void deleteNode2(int pos){
        Node temp=head;
        if(pos<=0){
            System.out.println("Enter the right position...GREATER THEN ZERO");
            return;
        }
        if(temp==null){
            System.out.println("Listed is already empty");
            return;
        }
        if(pos==1){
            head=temp.nxt;
            // head=head.nxt;
            return;
        }
        for(int i=1;i<pos-1 && temp.nxt!=null;i++){
            temp=temp.nxt;
        }
        if(temp.nxt==null){
            System.out.println("List is smaller then entered position .... ....  CAN'T DELETE"); 
            return;   
        }
        temp.nxt=temp.nxt.nxt;

    }
    public static void main(String[] args) {
        LinkedList_4 obj=new LinkedList_4();

        obj.insertAtEnd(2);
        obj.insertAtEnd(4);
        obj.insertAtEnd(8);
        obj.insertAtEnd(10);

        obj.display();
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position from you want delete: ");
        int pos=sc.nextInt();

        // obj.deleteNode(pos);

        obj.deleteNode2(pos);

        obj.display();
        System.out.println();

        sc.close();

        // Time complexity in deletion
        //  Best Time complexity O(1)... when you are deleting first node
        // Worst or Time complexity O(n)  ...n is number of nodes

    }
}
