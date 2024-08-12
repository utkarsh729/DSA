public class Q5 {
    List1 head1;
    class List1{
        int data1;
        List1 next1;
        List1(int data1){
            this.data1=data1;
            next1=null;
        }
    }

    List2 head2;
    class List2{
        int data2;
        List2 next2;
        List2(int data2){
            this.data2=data2;
            next2=null;
        }
    }

    public void insertInList1(int data1){
        List1 l1=new List1(data1);
        if(head1==null){
            head1=l1;
            return;
        }
        List1 curr=head1;
        while(curr.next1!=null){
            curr=curr.next1;
        }
        curr.next1=l1;
    }

    public void insertInList2(int data2){
        List2 l2=new List2(data2);
        if(head2==null){
            head2=l2;
            return;
        }
        List2 curr=head2;
        while(curr.next2!=null){
            curr=curr.next2;
        }
        curr.next2=l2;
    }

    public int sumList1(){
        List1 curr=head1;
        int sum1=0;
        // int i=0;
        while(curr!=null){
            // sum1=sum1+curr.data1*(int)Math.pow(10,i);
            sum1=sum1*10+curr.data1;
            curr=curr.next1;
            // i++;
        }
        return sum1;
    }

    public int sumList2(){
        List2 curr=head2;
        int sum2=0;
        // int i=0;
        while(curr!=null){
            // sum2=sum2+curr.data2*(int)Math.pow(10,i);
            sum2=sum2*10+curr.data2;
            curr=curr.next2;
            // i++;
        }
        return sum2;
    }

    // public int reverseNum(int num){
    //     int rsum=0;
    //     while(num>0){
    //         rsum=num%10+rsum*10;
    //         num=num/10;
    //     }
    //     return rsum;
    // }

    List3 head3;
    class List3{
        int data3;
        List3 next3;
        List3(int data3){
            this.data3=data3;
            next3=null;
        }
    }

    public void insertInList3(int sum){
        while(sum>0){
            List3 l3=new List3(sum%10);
            if(head3==null){
                head3=l3;
            }
            else{
                l3.next3=head3;
                head3=l3;
            }
            // else{
            //     List3 curr=head3;
            //     while(curr.next3!=null){
            //         curr=curr.next3;
            //     }
            //     curr.next3=l3;
            // }
            sum=sum/10;
        }
    }

    public void displayList3(){
        List3 curr=head3;
        while(curr!=null){
            System.out.print(curr.data3);
            if(curr.next3!=null)
            System.out.print("->");
            curr=curr.next3;
        }
        return;
    }
    
    
    
    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.insertInList1(7);
        obj.insertInList1(5);
        obj.insertInList1(9);
        obj.insertInList1(4);
        obj.insertInList1(6);

        int sum1=obj.sumList1();
       

        // int rsum1=obj.reverseNum(sum1);
       

        obj.insertInList2(8);
        obj.insertInList2(4);
        // obj.insertInList2(2);

        int sum2=obj.sumList2();

        // int rsum2=obj.reverseNum(sum2);

        // obj.insertInList3(obj.reverseNum(rsum1+rsum2));

        obj.insertInList3(sum1+sum2);

        obj.displayList3();
    }
}
