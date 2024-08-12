// Printing the middle value

public class LinkedList_7 {
    Node head;
    class Node{
        int data;
        Node nxt;
        Node(int data){
            this.data=data;
            nxt=null;
        }
    }
    public void insertAtEnd(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node n1=new Node(data);
        Node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        temp.nxt=n1;

    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nxt;
        }
    }
    public int totalNode(Node temp){
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.nxt;
        }
        return count;
    }
    public void middle(int n){
        Node curr=head;
        int i=0;
        while(i<=n/2){
            if(i==n/2){
                System.out.println(curr.data);
            }
            i++;
            curr=curr.nxt;
        }   
    }

    public void printMiddle(){
        Node slowPtr=head, fastPtr=head;

        while(fastPtr!=null && fastPtr.nxt!=null){
            slowPtr=slowPtr.nxt;
            fastPtr=fastPtr.nxt.nxt;
        }

        System.out.println(slowPtr.data);
    }

    public static void main(String[] args) {

        LinkedList_7 obj=new LinkedList_7();
        obj.insertAtEnd(2);
        obj.insertAtEnd(4);
        obj.insertAtEnd(6);
        obj.insertAtEnd(8);
        obj.insertAtEnd(10);
        obj.insertAtEnd(112);
        obj.insertAtEnd(100);
        obj.insertAtEnd(0);
        obj.insertAtEnd(10);
        obj.insertAtEnd(10);

        obj.display();
        System.out.println();
        System.out.println("middle value is: ");
        obj.middle(obj.totalNode(obj.head));

        System.out.println();
        System.out.println("Middle value is: ");
        obj.printMiddle();



        
    }
}
