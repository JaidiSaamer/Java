public class Fibo {
    public static void main(String[] args) {
        int num1 = 0,num2 = 1;
        int fibo;
        for(int i=1;i<=10;i++){
            fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
            System.out.println(fibo);
        }
    }
    
}
