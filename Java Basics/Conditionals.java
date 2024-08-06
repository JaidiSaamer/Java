public class Conditionals {
    public static void main(String args[]){
        // int x = 190;
        
        // if(x > 10 && x <= 20)
        //     System.out.println("Hello");
        
        // else
        //     System.out.println("Bye");

        // int x = 12;
        // int y = 19;
        // int z = 20;

        // if(x > y && x > z){
        //     System.out.println("Value of x :"+x);
        //     System.out.println("X is greater");
        // }
        // else if (y > x && y > z) {
        //     System.out.println("Value of y :"+y);            
        //     System.out.println("Y is greater");
        // }
        // else{
        //     System.out.println("Value of z :"+z);
        //     System.out.println("Z is greater");
        // }

        //Short hand if-else / Ternary operator
        // int n = 5;
        // int res = 0;

        // if(n % 2 == 0)
        //     res = 10;
        // else
        //     res = 20;

        // res = n % 2 == 0 ? 10 : 20 ;

        // System.out.println(res);


        // Switch case
        // int n = 5;

        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Enter a valid number");
        // }



        // Loops

        // int i = 1;

        // while(i <= 4){
        //     System.out.println("Hi "+ i);
        //     int j = 1;
        //     while(j <= 3){
        //         System.out.println("Hello "+j);
        //         j++;
        //     }
        //     i++;
        // }
        // System.out.println("Bye "+i);


        // int i = 5;  //-> this will execute at least once

        // do{
        //     System.out.println("Hi "+i);
        //     i++;
        // }while(i <= 4);
        


        // for(int i = 1; i <= 4; i++)
        // {
        //     System.out.println("Hi "+ i);
        // }

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("DAY "+ i);

            for(int j = 1; j <= 9; j++)
            {
                System.out.println("  "+(j+8)+" - "+(j+9));
            }
        }

        
    }
    
}
