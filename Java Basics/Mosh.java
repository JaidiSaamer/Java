// import java.util.Arrays;
// import java.util.Date;

// import java.text.NumberFormat;
import java.util.Scanner;

public class Mosh {
    public static void main(String[] args) {
        // int age = 19;
        // Date now = new Date();
        // System.out.println(now);

        // String value = "Java";
        // String value2 = value;
        // value = "python"; -- > this one doesn't change the value

        // String message = "Hello World" + "!!";

        // System.out.println(message.length());
        // System.out.println(message.replace("!","-"));
        // System.out.println(message);

        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;

        // int [] numbers = {2,3,5,1,4};
        // System.out.println(numbers.length);
        // Arrays.sort(numbers);

        // System.out.println(Arrays.toString(numbers));

        // int[][] numbers = new int[2][3];
        // numbers[0][0] = 1;
        // numbers[0][1] = 9;
        // numbers[1][0] = 5;

        // int[][] numbers = {{1,2,3},{4,5,6}};
        // System.out.println(Arrays.deepToString(numbers));

        // final float PI = 3.14F; --> by using final keyword this variable,will become a constant and we can't change it's value later in program.

        // double divisionOf = (double) 10 / (double) 3;  //-->Here we use type casting to get floating point value.
        // System.out.println(divisionOf);



        // Implicit casting

        // byte -> short -> int -> long -> float -> double
        // short x = 1;
        // int y = x + 2;


        // Explicit casting

        // double x = 2.1;
        // int y = (int)x + 2;
        // System.out.println(y);

        // We cannot cast a string to a number,If we want to cast a string to number then we use wrapper class.

        // String x = "1";
        // Integer.parseInt(x)  //->this method takes a string and returns an integer.
        // int y = Integer.parseInt(x) + 2;
        // System.out.println(y);

        // if x is floating point number
        // String x = "1.1";
        // double y = Double.parseDouble(x) + 2;
        // System.out.println(y);



        // Math class

        // int result = Math.round(1.2F);
        // int result = (int)Math.ceil(1.2F);
        // int result = (int)Math.floor(1.2F);
        // int result = (int)Math.max(1,2);
        // int result = (int)Math.min(1,2);
        // double result = Math.random()*100;
        // double result = Math.round(Math.random()*100);
        // int result = (int)Math.round(Math.random()*100);
        // int result = (int) (Math.random()*100);  //-->this will give random number without decimal point



        //  Formatting Numbers

        // NumberFormat currency = NumberFormat.getCurrencyInstance();

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result = percent.format(0.1); //--> O/p- 10%

        // We can do above operation in one line by method chaining,which is shown below.
        // String result = NumberFormat.getPercentInstance().format(0.1);   // -> O/P : 10%

        // System.out.println(result);


        // Taking input from user

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Age:");
        // byte age = scanner.nextByte();
        System.out.print("Name:");

        // String name = scanner.next();//->next method will not take input data after the user enter whiteSpace,so we use nextLine()

        String name = scanner.nextLine().trim(); // here we using trim method to remove extra whiteSpace.

        System.out.println("You are "+name);

    }
}
