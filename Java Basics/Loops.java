// import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for(int i = 5; i > 0; i--)
        //     System.out.println("hello world "+i);

        // While loop
        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        // while(!input.equals("quit")){
        //     System.out.print("Input: ");
        //     input = scanner.next().toLowerCase();
        //     System.out.println(input);
        // }


        // do while loop
        // do{
        //     System.out.print("Input: ");
        //     input = scanner.next().toLowerCase();
        //     System.out.println(input);
        // }while(!input.equals("quit"));


        // break & continue
        // while(true){
        //         System.out.print("Input: ");
        //         input = scanner.next().toLowerCase();
        //         if(input.equals("pass"))
        //         continue;
        //         if(input.equals("quit"))
        //         break;
        //         System.out.println(input);
        //     }



        // for each loop
        String[] fruits = {"Apple","Mango","Orange"};
        for(int i = 0; i < fruits.length; i++)
            System.out.println(fruits[1]);

        for(String f:fruits)
            System.out.println(f);

        // There is limitation of for each loop, it cannot iterate from end to beginning.it always forward begining to an end.We also cannot access the index of each item in for each loop.
    }
    
}
