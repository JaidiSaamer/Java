// WAP to check a number is palindrome or not using recursion.

// import java.util.Scanner;

public class palinum {

    static void printPalindrome(){
        int num = 121,rev = 0,temp = num;
        // Scanner scanner = new Scanner(System.in);
        // num = scanner.nextInt();
        while(num > 0){
            int rem = num % 10;
            // reverse number
            rev = rev * 10 + rem;
            // System.out.println(num % 10);
            num /= 10;  //num = num / 10;
        }
        
        if(rev == temp)
            System.out.println("Yes, it's a palindrome");
        else
            System.out.println("NO,it's not a palindrome");
    }
    public static void main(String[] args) {
        printPalindrome();
    }
}
