import java.util.Arrays;

public class fractionalKnapSack1 {
    public static void main(String[] args) {
        int []profit={25,75,100,50,45,90,30};
        int []weight={5,10,12,4,7,9,3};
        int capacity=37 ;

        float []pw=new float[profit.length];
         
        for(int i=0; i<pw.length;i++){
            pw[i]=((float)profit[i]/(float)weight[i]);
        }
         
        System.out.println(Arrays.toString(pw));

        for(int i=0;i<pw.length-1;i++){
            int max_idx=i;
            for(int j=i+1;j<pw.length;j++){
                if(pw[j]>pw[max_idx ]){
                    max_idx=j;
                }
            }
            float temp=pw[max_idx];
            pw[max_idx]=pw[i];
            pw[i]=temp;

            int p=profit[max_idx];
            profit[max_idx]=profit[i];
            profit[i]=p;

            int w=weight[max_idx];
            weight[max_idx]=weight[i];
            weight[i]=w;

        }

        System.out.println(Arrays.toString(pw));
        System.out.println(Arrays.toString(profit));
        System.out.println(Arrays.toString(weight));
         
        float maxProfit=0;

        for(int i=0;i<pw.length;i++){
            if(capacity<=0){
                break;
            }
            else if(capacity-weight[i]>0){
                maxProfit+=profit[i];
                capacity-=weight[i];
            }
            else{
                maxProfit+=((float)capacity/weight[i])*(float)profit[i];
                capacity=0;
            }
        }
        System.out.println(maxProfit);
    }   
}
