public class minMax6 {
    static class Pair{
        int min;
        int max;
    }
    public static Pair getMinMax(int []arr, int low, int high){
        Pair minmax=new Pair();
        Pair minmaxLeft=new Pair();
        Pair minmaxRight=new Pair();

        // when only 1 element
        if(low==high){
            minmax.min=arr[low];
            minmax.max=arr[low];
            return minmax;
        }
        // when 2 element only

        else if(low==high-1){
            if(arr[low]<arr[high]){
                minmax.max=arr[high];
                minmax.min=arr[low];
            }
            else{
                minmax.max=arr[low];
                minmax.min=arr[high];
            }
            return minmax;
        }

        // big problem
        else{
            int mid=low+(high-low)/2;
            minmaxLeft=getMinMax(arr, low, mid);
            minmaxRight=getMinMax(arr, mid+1, high);
            if(minmaxLeft.min<minmaxRight.min){
                minmax.min=minmaxLeft.min;
            }
            else{
                minmax.min=minmaxRight.min;
            }
            if(minmaxLeft.max>minmaxRight.max){
                minmax.max=minmaxLeft.max;
            }
            else{
                minmax.max=minmaxRight.max;
            }
            return minmax;
        }
    }

    public static void main(String[] args) {
        int []arr={20,10,40,70,50,90,30};

        Pair maxmin=getMinMax(arr, 0,arr.length-1);

        System.out.println(maxmin.min+"  "+maxmin.max);
    }
}
