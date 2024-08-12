// Missing number in an array
// ak array diya jayega 1 to n...aur ak element miss hoga..usko find karna hai
public class Array_3 {
    public static void main(String[] args) {

        // Approach 1
        // int []arr={1,4,3,7,6,2};
        int []arr={2,4,5,1};
        int len=arr.length;
        int miss=1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(miss==arr[j]){
                    miss++;
                    break;
                }
            }
        }
        System.out.println("Missing number is: "+miss);

        // Approach 2
        // 
        int sumArr=0;
        for(int i=0;i<len;i++){
            sumArr+=arr[i];  // sum of element in array
        }
        int n=len+1;
        int sum=(n*(n+1))/2; // sum of natural number

        System.out.println("Missing number is: "+(sum-sumArr));

        int total=1;
        
        for(int i=2;i<=n;i++){
            total+=i;
            total-=arr[i-2];
        }
        System.out.println("Missing number is: "+total);
    }
}
