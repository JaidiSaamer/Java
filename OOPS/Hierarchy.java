package OOPS;

class Animal{
    int legs = 4;
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("bow..bow..");
    }

}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow..Meow");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        System.out.println("Dog Class:");
        Dog sheero = new Dog();
        System.out.println(sheero.legs);
        sheero.sound();

        System.out.println("Cat Class:");
        Cat mechan = new Cat();
        System.out.println(mechan.legs);
        mechan.sound();

    }    
}
