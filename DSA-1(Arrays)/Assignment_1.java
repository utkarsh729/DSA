
public class Assignment_1 {
    public static void main(String[] args) {
        int []arr={3,20,4,6,9};
        // int []arr={3,3,3,3,3};

        // Ans 1
        int sum=0;
        for(int i=0;i<arr.length;i+=2){
           sum+=arr[i];
        }
        System.out.println(sum);

        //Ans 2
        for(int i:arr){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // Ans 3
        // int max=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximum element in an array is: "+max);

        // Ans 4
        max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
            continue;
            else if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        if(secondMax==Integer.MIN_VALUE){
            System.out.println("There is no second maximum element");
        }
        else
        System.out.println("Second maximum element in ar array is: "+secondMax);

        // Ans 5
        int []arr2={1,4,7,3,2,6,5};
        // int []arr2={2,2,2,2,2};
        int peak=Integer.MIN_VALUE;
        for(int i=1;i<arr2.length-1;i++){
            if(arr2[i]>arr2[i-1]&&arr2[i]>arr2[i+1]){
                if(arr2[i]>peak){
                    peak=arr2[i];
                }
            }
        }
        if(peak==Integer.MIN_VALUE)
        System.out.println("There is no peak element");
        else
        System.out.println("peak element in an array is: "+peak);

    }
}
