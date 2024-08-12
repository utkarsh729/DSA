public class Q3 {
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
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    public void display(Node curr){
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public Q3.Node removeDuplicates(Node head){
        Node curr=head.next;
        Node prev=head;
        while(curr!=null){
            if(prev.data==curr.data){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
            
        }
        return head;
        
    }

    public void removeDuplicates2(){
        Node curr=head;

        if(head==null && head.next==null)
        return;

        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return;
    }

    public static void main(String[] args) {
        Q3 obj=new Q3();
        obj.insertAtEnd(1);
        obj.insertAtEnd(1);
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        obj.insertAtEnd(2);
        obj.insertAtEnd(3);
        obj.insertAtEnd(4);
        obj.insertAtEnd(4);
        obj.insertAtEnd(4);
        obj.insertAtEnd(55);
        
        obj.display(obj.head);

        System.out.println();

        // System.out.println(obj.head.next.next.data);

        System.out.println("List after removing duplicates: ");

        obj.removeDuplicates2();

        // Node n1=obj.removeDuplicates(obj.head);
        
        obj.display(obj.head);


        System.out.println();
    }
}
