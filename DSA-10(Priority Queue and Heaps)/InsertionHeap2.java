// MIN Heap  
public class InsertionHeap2 {

    public static void heapify(int []arr, int i){
        // i=2*parent + 1 or i=2*parent + 2
        int parent=(i-1)/2;
        if(arr[parent]>arr[i]){
            int temp=arr[parent];
            arr[parent]=arr[i];
            arr[i]=temp;

            heapify(arr, parent);
        }


    }

    public static int insert(int []arr, int n, int value){
        n++;
        arr[n]=value;
        if(n>0){
            heapify(arr, n);
        }
        return n;
    }
    public static void main(String[] args) {
        int MAX=100;
        int []arr=new int[MAX];
        int n=-1;

        n=insert(arr, n, 10);
        n=insert(arr, n, 30);
        n=insert(arr, n, 40);
        n=insert(arr, n, 20);
        n=insert(arr, n, 5);
        n=insert(arr, n, 50);
        n=insert(arr, n, 6);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
