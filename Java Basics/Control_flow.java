// import java.util.Scanner;

public class Control_flow {
    public static void main(String[] args) {

        // int temperature = 22;
        // boolean isWarm = temperature > 20 && temperature < 50;
        // System.out.println((isWarm));


        // boolean hasHighIncome = false;
        // boolean hasGoodCredit = true;
        // boolean hasCriminalRecord = false;
        // boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        // System.out.println(isEligible);



        // System.out.print("Enter today's temperature: ");

        // Scanner scanner = new Scanner(System.in);
        // int temp = scanner.nextInt();
 
        // // int temp = 32;
        // if(temp > 30){
        //     System.out.println("It's a hot day");
        //     System.out.println("Drink plenty of water");
        // }
        // else if(temp > 20)
        //     System.out.println("Nice day!");
        // else
        //     System.out.println("Cold day");

        
        // int income = 120_000;
        // boolean hasHighIncome = (income > 120_000); //->Professional way of writing code.
        // System.out.println(hasHighIncome);


        // Ternary operator

        // int income = 120_000;
        // String className = income > 100_000 ? "First Class" : "Economy Class";
        // System.out.println(className);


        // Switch case

        // String role = "admin";
        int role = 1;

        switch(role){
            // case "admin":
            case 1:
                System.out.println("You're an admin");
                break;
            
            // case "moderator":
            case 2:
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a Guest");
        }

        // if (role == "admin")
        //     System.out.println("You're an admin");
        // else if(role == "moderator")
        //     System.out.println("You're a moderator");
        // else
        //     System.out.println("You're a guest");
    }
    
}
