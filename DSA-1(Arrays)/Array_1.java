// palindrome array

public class Array_1{
    public static void main(String[] args) {
        // int arr[];
        // arr=new int[5];

        // arr={1,2,3,2,1};  error

        // Approach 1
        // this is good approach 
        // time complexity= O(n)
        // space complexity=O(1)

        int []ar={1,2,3,2,1};
        boolean hai=true;
        int last =ar.length;
        for(int i=0;i<last/2;i++){
            if(ar[i]==ar[last-i-1])
            continue;
            else{
                hai=false;
                break;
            }
        }
        if(hai){
            System.out.println("panlindrome");
        }
        else{
            System.out.println("NO");
        }


        // Approach 2
        // not good approach as space complexity is more
        // time complexity =O(n)
        // space complexity = O(n)  --> as we are using extra space here
        int []arr=new int[last];
        int j=0;
        for(int i=last-1;i>=0;i--){
            arr[j++]=ar[i];
            
        }
        System.out.println("done");
        for(int i=0;i<last;i++){
            if(arr[i]==ar[i])
            continue;
            else{
                hai=false;
                break;
            }
        }

        if(hai){
            System.out.println("Panlindrome");
        }
        else{
            System.out.println("NO");
        }
    }
}