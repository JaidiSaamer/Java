public class Recursion {
    static void printSeries(int num){
        System.out.println(num);
        if(num < 100)  // -> base case
            printSeries(num+1); //self calling
            // System.out.println(num);
    }

    public static void main(String[] args) {
        // for(int i = 0; i < 5; i ++)
        //     System.out.println(i);
        printSeries(50);

        // Repeat the video tutorial
    }
}
