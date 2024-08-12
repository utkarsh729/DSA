
public class Q4 {
    Node1 head1;
    class Node1{
        int data;
        Node1 next1;
        Node1(int data){
            this.data=data;
            next1=null;
        }
    }

    Node2 head2;
    class Node2{
        int data;
        Node2 next2;
        Node2(int data){
            this.data=data;
            next2=null;
        }
    }

    public void insertAtEnd(int data){
        Node1 n1=new Node1(data);
        if(head1==null){
            head1=n1;
            return;
        }
        Node1 curr=head1;
        while(curr.next1!=null){
            curr=curr.next1;
        }
        curr.next1=n1;
    }

    public void copyData(){
        Node1 c1=head1;
        while(c1!=null){
            
            Node2 n2=new Node2(c1.data);
            if(head2==null){
                head2=n2;
                c1=c1.next1;
                continue;
            }
            n2.next2=head2;
            head2=n2;
            c1=c1.next1;
        }
        return;
    }

    
    

    public boolean checkPalindrome(Node1 temp1,Node2 temp2){
        boolean hai =true;  
        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }
            temp1=temp1.next1;
            temp2=temp2.next2;   
        }
        return hai;
    }

    public void display1(){
        Node1 temp1=head1;
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next1;
        }  
    }

    public void display2(){
        Node2 temp2=head2;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next2;
        }
        
    }
    
    public static void main(String[] args) {
        Q4 obj=new Q4();
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        obj.insertAtEnd(1);
        obj.insertAtEnd(1);

        obj.display1();
        System.out.println();

        obj.copyData();
        // copydata ko checkPalindrome ke andar call mat karna..kyuki abhi head2 ki value null hai..
        // isliye bahar call kiya hai ..andar call nahi kiya

        System.out.println(obj.checkPalindrome(obj.head1, obj.head2));

        obj.display2();
        System.out.println();

    }
}
