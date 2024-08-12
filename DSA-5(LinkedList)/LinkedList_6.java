// Reverse the linked list by recursion
// Time complexity : O(n)...n is number of nodes
// space complexity: O(1)

public class LinkedList_6 {
    Node head;
    class Node{
        int data;
        Node nxt;
        Node(int data){
            this.data=data;
            nxt=null;
        }
    }

    public void insertAtBeginning(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            return;
        }
        n1.nxt=head;
        head=n1;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nxt;
        }
    }

    public void reverseLinkedList(Node prev, Node curr, Node next){
        if(curr==null){
            head=prev;
            return;
        }
        next=curr.nxt;
        curr.nxt=prev;
        prev=curr;
        curr=next;
        reverseLinkedList(prev, curr, next);
    }

    public void reversalLinkedList2(Node curr, Node prev){
        if(curr.nxt==null){
            head=curr;
            curr.nxt=prev;
            return;
        }
        Node nextPtr=curr.nxt;
        curr.nxt=prev;
        reversalLinkedList2(nextPtr, curr);
    }
    public static void main(String[] args) {
        
        LinkedList_6 obj =new LinkedList_6();

        obj.insertAtBeginning(10);
        obj.insertAtBeginning(8);
        obj.insertAtBeginning(3);
        obj.insertAtBeginning(11);

        obj.display();

        System.out.println();

        obj.reverseLinkedList(null,  obj.head ,null);

        System.out.println("After reversal: ");
        obj.display();
        System.out.println();
        
        obj.reversalLinkedList2(obj.head, null);
        
        System.out.println("After reversal: ");
        obj.display();
        System.out.println();

    }
}
