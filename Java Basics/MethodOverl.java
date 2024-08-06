public class MethodOverl{

    // static int sum(int a, int b){
    //     return a + b;
    // }

    // static double sum(double a, double b){
    //     return a + b;
    // }

    // static double sum(double a, double b, double c){
    //     return a + b + c;
    // }

    // public static void main(String[] args) {
    //     System.out.println(sum(9.0,4.9,2.3));
    //     System.out.println(sum(4,2));
    //     System.out.println(sum(9.8,1.2,3.9));
    //     System.out.println(sum(3.4,6.7));

    // }



// WAP to check greatest among two or three numbers
    static int check(int a,int b){
        if(a > b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
        return 0;
    }

    static int check(int a,int b,int c){
        if(a > b && a > c)
            System.out.println("first one is greater");
        else if(b > c && b >a)
            System.out.println("Second one is greater");
        else
            System.out.println("Third one is greater");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(check(5, 9));
        System.out.println(check(10,20));
        System.out.println(check(5,99,55));
        System.out.println(check(00,01));
        System.out.println(check(8,12,1012));
    }

}
