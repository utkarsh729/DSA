

// MAX HEAP
public class InsertionHeap1 {
    public static void swap(int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void heapify(int []arr, int i){
        // i=2*parent +1 or i=2*parent +2
        int parent =(i-1)/2;
        if(arr[parent]<arr[i]){
            swap(arr, i, parent);
            heapify(arr, parent);
        }
    }

    public static int  insert(int []arr, int n, int value){
        n++;
        arr[n]=value;
        if(n>0){
            heapify(arr, n);
        }
        return n;
    }

    public static void main(String[] args) {
        int MAX=100;
        int n=-1;
        int []arr=new int[MAX];
 

        n=insert(arr, n, 100);
        n=insert(arr, n, 90);
        n=insert(arr, n, 80);
        n=insert(arr, n, 120);
        n=insert(arr, n, 400);
        n=insert(arr, n, 40);
        n=insert(arr, n, 700);
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }

        
    }
}