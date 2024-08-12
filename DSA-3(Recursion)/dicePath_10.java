public class dicePath_10{
    public static void printPath(int curr, int dest,String path){
        if(curr==dest){
            System.out.println(path);
            return;
        }
        if(curr>dest){
            return;
        }
        // here we have number of fixed choice = 6....ya toh hum 1 chale ya 2 chale...ya 6
        // so number of recursive call = 6
        printPath(curr+1, dest, path+1);
        printPath(curr+2, dest, path+2);
        printPath(curr+3, dest, path+3);
        printPath(curr+4, dest, path+4);
        printPath(curr+5, dest, path+5);
        printPath(curr+6, dest, path+6);

    }
    public static void main(String[] args) {
        // Problem statement.. you are given destination..and you have dice..
        // print total possible path to reach desitnation

        printPath(0,4,"");
    }
}