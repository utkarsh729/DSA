
public class Q2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void insertNode(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            return;
        }
        n1.next=head;
        head=n1;
    }

    public void display(Node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
       
    }

    public void insertAfterValue(int value,int data){
        Node curr=head;
        Node n1=new Node(data);
        while(curr!=null){
            if(curr.data==value){
                n1.next=curr.next;
                curr.next=n1;
                return;
            }
            curr=curr.next;
        }
        System.out.println("\nGiven value is not present is list...Insertion cannot be done");
    }
    public static void main(String[] args) {
        Q2 obj=new Q2();
        obj.insertNode(1);
        obj.insertNode(12);
        obj.insertNode(4);
        obj.insertNode(9);

        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the value after which you want to insert node:");
        int value=sc.nextInt();
        System.out.println("enter the data that you want to insert: ");
        int data=sc.nextInt();

        System.out.println("Before insertion: ");
        obj.display(obj.head);

        obj.insertAfterValue(value, data);
        System.out.println("\nAfter insertion: ");
        obj.display(obj.head);
        System.out.println();


        sc.close();
    }
}
