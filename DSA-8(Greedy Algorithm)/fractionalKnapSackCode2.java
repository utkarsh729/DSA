import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapSackCode2 {

    private static double getMaxValue(Knapsack []objarr, int capacity){
        double maxProfit=0;
        Arrays.sort(objarr, new Comparator<Knapsack>(){
            @Override
            public int compare(Knapsack item1, Knapsack item2){
                double cpr1=Double.valueOf(item1.profit/item1.weight);
                double cpr2=Double.valueOf(item2.profit/item2.weight);
                if(cpr1<cpr2){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        for(Knapsack i: objarr){
            int profit=(int)i.profit;
            int weight=(int)i.weight;

            if(capacity-weight>=0){
                maxProfit+=profit;
                capacity-=weight;
            }
            else{
                double fraction=((double)capacity/(double)weight);
                maxProfit+=(fraction*profit);
                capacity=(int)(capacity-(weight*fraction));
                break;
            }
        }
        return maxProfit;
    }
    static class Knapsack{
        int profit;
        int weight;
        public Knapsack(int profit, int weight){
            this.profit=profit;
            this.weight=weight;
        }
    }
   
    public static void main(String[] args) {
        // Knapsack []arr=new Knapsack[7];
        // arr[0]=new Knapsack(25, 5);
        // arr[1]=new Knapsack(75, 10);
        // arr[2]=new Knapsack(100, 12);
        // arr[3]=new Knapsack(50, 4);
        // arr[4]=new Knapsack(45, 7);
        // arr[5]=new Knapsack(90, 9);
        // arr[5]=new Knapsack(30, 3);

        Knapsack []objarr={new Knapsack(25, 5),
            new Knapsack(75, 10),
            new Knapsack(100, 12),
            new Knapsack(50, 4),
            new Knapsack(45, 7),
            new Knapsack(90, 9),
            new Knapsack(30, 3),};

        int capacity=37;
         
        double maxValue = getMaxValue(objarr,capacity);

        System.out.println(maxValue);
    }
}
