public class LinkedList_1{
    Node head;  // automatically initialze with null
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    // insertion at end
    public void insertAtEnd(int newdata){
        Node newNode=new Node(newdata);

        // if linked list empty  ..
        // Time complexity: O(1)
        if(head==null){
            head=newNode;
            return;
        }
        // if list is not empty
        // time complexity = O(n)   n is number of nodes
        Node temp=head;
        while(temp.next!=null){
          
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        
        LinkedList_1 ll1=new LinkedList_1();
        ll1.insertAtEnd(2);
        ll1.insertAtEnd(4);
        ll1.insertAtEnd(8);
        System.out.println();
        ll1.display();
        
        ll1.insertAtEnd(10);
        System.out.println();
        ll1.display();
    }
}