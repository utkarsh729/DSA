// MAX Heap



public class DeletionHeap3 {
    public static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static int delete(int []arr,int n, int element){
        int idx=-1;
        for(int i=0;i<=n;i++){
            if(arr[i]==element){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Element is not present in heap");
            return n;
        }
        arr[idx]=Integer.MAX_VALUE;
        heapify(arr, idx);
        
        // swap..first element with last element
        swap(arr, 0, n);

        heapifyDown(arr,n, 0);

        return n-1;
    }
    public static void heapify(int []arr, int idx){
        int parent=(idx-1)/2;
        if(parent>=0 && arr[parent]<arr[idx]){
            //swap
            swap(arr, idx, parent);
            heapify(arr, parent);
        } 
        
    }
    public static void heapifyDown(int []arr, int n, int idx){
        int left=2*idx+1;
        int right=2*idx+2;
        int largest=-1;
        if(left<=n &&arr[left]>arr[idx]){
            largest=left;
        }
        if(right<=n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest==-1){
            return;
        }

        // swap
        swap(arr,idx,largest);

        heapifyDown(arr, n, largest);

    }
    public static int insert(int []arr, int n, int value){
        n++;
        arr[n]=value;
        return n;
    }
    public static void main(String []args){
        int max=100;
        int []arr=new int[max];

        int n=-1;
        n=insert(arr, n, 100);
        n=insert(arr, n, 80);
        n=insert(arr, n, 90 );
        n=insert(arr, n, 70);
        n=insert(arr, n, 60);
        n=insert(arr, n, 50);
        n=insert(arr, n, 40);
        n=insert(arr, n, 30);
        n=insert(arr, n, 20);
        n=insert(arr, n, 10);
        
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int element=100;
        n=delete(arr, n,element);
        
        
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
