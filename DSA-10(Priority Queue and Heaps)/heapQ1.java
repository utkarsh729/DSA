import java.util.PriorityQueue;
public class heapQ1 {
    public static void makeHeap(int []arr){
        int n=arr.length;
        for(int i=(n/2)-1; i>=0;i--){
            heapify(arr, n, i);
        }
    }
    public static void heapify(int []arr, int n, int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }
    public static void swap(int []arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public static void main(String[] args) {
        int []arr={1,2,3,5,2,6,9};
        int k=3;

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int j:arr){
            pq.add(j);
        }

        while(k>1){
            pq.poll();
            k--;
        }
        
        System.out.println(pq.peek());

        k=3;
        makeHeap(arr);
        int i=1;
        while(i<k){
            arr[0]=arr[arr.length-i];
            heapify(arr, arr.length-i, 0);
            i++;
        }
        System.out.println(arr[0]);


        
    }
}
