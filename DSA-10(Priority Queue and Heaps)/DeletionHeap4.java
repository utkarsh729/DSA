// MIN HEAP

public class DeletionHeap4 {
    
    public static int insert(int []arr, int n, int value){
        n++;
        arr[n]=value;
        return n;
    }

    public static int delete(int []arr, int n, int element){
        int idx=-1;
        for(int i=0;i<=n;i++){
            if(arr[i]==element){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Element not found");
            return n;
        }

        arr[idx]=Integer.MIN_VALUE;
        heapifyUp(arr, idx);

        //swap ...first with last
        swap(arr,0, n);

        heapifyDown(arr, n, 0);
        return n-1;
    }
    public static void heapifyUp(int []arr, int idx){
        int parent=(idx-1)/2;
        if(parent>=0 && arr[parent]>arr[idx]){
            swap(arr, parent , idx);
            heapifyUp(arr, parent);
        }
    }
    public static void swap(int []arr, int i, int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void heapifyDown(int []arr, int n, int idx){
        int smallest=-1;
        int left=2*idx+1;
        int right=2*idx+2;

        if(left<=n && arr[left]<arr[idx]){
            smallest=left;
        }
        if(right<=n && arr[right]<arr[smallest]){
            smallest = right;
        }
        if(smallest==-1){
            return ;
        }

        swap(arr, idx, smallest);
        heapifyDown(arr, n, smallest);
    }
    public static void main(String[] args) {
        int max=100;
        int []arr=new int [max];
        int n=-1;
        n=insert(arr, n, 10);
        n=insert(arr, n, 20);
        n=insert(arr, n, 30);
        n=insert(arr, n, 40);
        n=insert(arr, n, 50);
        n=insert(arr, n, 60);
        n=insert(arr, n, 70);
        n=insert(arr, n, 80);
        n=insert(arr, n, 90);
        n=insert(arr, n, 100);

        for(int i =0; i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int element=60;
        n=delete(arr, n, element);

        for(int i =0; i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
