import java.util.Scanner;

public class Q1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void insertNode(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }

    public void findData(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                System.out.println(data+" is present in the linked list");
                return;
            }
            temp=temp.next;
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        Q1 obj =new Q1();
        obj.insertNode(2);
        obj.insertNode(5);
        obj.insertNode(21);
        obj.insertNode(4);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data that you want to search in linkedlist: ");
        int data=sc.nextInt();
        obj.findData(data);
        sc.close();
    }
}
