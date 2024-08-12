import java.util.ArrayList;
import java.util.Collections;

//time complexity = O(n^2)
// space complexity= O(n)

public class jobScheduling3 {
    char id;
    int profit, deadline;
    jobScheduling3(){}
    jobScheduling3(char id, int deadline, int profit){
        this.id =id;
        this.profit=profit;
        this.deadline=deadline;
    }

    // function defination --> Greedy approach
    void jobSequence(ArrayList<jobScheduling3>arr, int maxDeadline){
        int n=arr.size();

        // lambda expression...sorting on basis of profit
        Collections.sort(arr, (a,b) -> b.profit-a.profit);

        //keep the track of booked slot
        boolean []result=new boolean[maxDeadline];

        // to store the job ids
        char []jobs=new char[maxDeadline];

        // to store the jobs id according to the given deadline
        for(int i=0;i<n;i++){
            // for(int j=arr.get(i).deadline-1;j>=0;j--)
            for(int j=Math.min(maxDeadline-1,arr.get(i).deadline-1);j>=0;j--){
                // if slot available --> false
                if(result[j]==false){
                    result[j]=true;
                    jobs[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(char id: jobs){
            System.out.print(id+" ");

        }
        System.out.println();


    }
    public static void main(String[] args) {
        ArrayList<jobScheduling3> arr=new ArrayList<>();
        arr.add(new jobScheduling3('1',5,55));
        arr.add(new jobScheduling3('2',2,65));
        arr.add(new jobScheduling3('3',7,75));
        arr.add(new jobScheduling3('4',3,60));
        arr.add(new jobScheduling3('5',2,70));
        arr.add(new jobScheduling3('6',1,50));
        arr.add(new jobScheduling3('7',4,85));
        arr.add(new jobScheduling3('8',5,68));
        arr.add(new jobScheduling3('9',3,45));

        System.out.println("Job sequences to get maximum profit");

        jobScheduling3 obj=new jobScheduling3();

        obj.jobSequence(arr, 7);



    }
}
