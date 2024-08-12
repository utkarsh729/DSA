public class LinkedList_2 {
    Node head;
    class Node{
        int data;
        Node nxt;
        Node(int data){
            this.data=data;
            nxt=null;
        }
    }
    // insert at beginning
    public void insertAtBegan(int data){
        Node newNode=new Node(data);
        // time complexity is always O(1)

        // if(head==null){
        //     // head=new Node(data);
        //     head=newNode;
        //     return;
        // }   // this is not required while inserting at beginnig

        newNode.nxt=head;
        head=newNode;
        return;
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.nxt;
            // head=head.nxt;   --> if we use head then the original list will change..every time head changes
        }
        
    }
    public static void main(String[] args) {

        LinkedList_2 obj=new LinkedList_2();
        obj.insertAtBegan(2);
        obj.insertAtBegan(4);
        obj.insertAtBegan(8);

        obj.display();

        obj.insertAtBegan(1);
        System.out.println("\n---------------------");
        obj.display();
        
    }
}
