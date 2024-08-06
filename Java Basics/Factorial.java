public class Factorial {
    static void printFactorial(int num){
        int fact = 1;
        for(int i = num ; i >= 1 ;i--){
            fact *= i;  // fact = fact * i;
        }
        System.out.println(num+"!= "+fact);
    }
    public static void main(String[] args) {
        printFactorial(3);
        printFactorial(5);
        printFactorial(7);
        printFactorial(25);
    }
}
