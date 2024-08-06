package OOPS;

class Features{
    static void add(int a, int b){
        System.out.println(a + b);
    }

    static void add(double a, double b){
        System.out.println(a + b);
    }

    static void add(int a, double b){
        System.out.println(a + b);
    }

    static void print(){
        System.out.println("hi,form class Features");
    }
}

public class Poly {
    public static void main(String[] args) {
        Features.add(2,3);
        Features.add(3.4,4.7);
        Features.add(4,2.1);
        Features.add(4.2,2);

        Features.print();
        print();
    }
    
    static void print(){
        System.out.println("Hi,from class Poly");
    }
}
