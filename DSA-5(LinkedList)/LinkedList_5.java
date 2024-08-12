public class LinkedList_5 {
    Node head;
    class Node{
        int data;
        Node n;
        Node(int data){
            this.data=data;
            n=null;
        }
    }
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.n=head;
        head=newNode;
    }

    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.n;
        }
    }
    // Reverse the LinkedList
    public void reverseLinkedList(){
        Node curr=head;
        Node prev=null;
        Node next=null;

        while(curr!=null){
            next=curr.n;
            curr.n=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return;
    }
    public static void main(String[] args) {
        LinkedList_5 obj=new LinkedList_5();
        obj.insertAtBeginning(2);
        obj.insertAtBeginning(4);
        obj.insertAtBeginning(8);
        obj.insertAtBeginning(10);

        obj.display();

        System.out.println("\n------------------------\n");

        obj.reverseLinkedList();

        obj.display();

        

    }
}
