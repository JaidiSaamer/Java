package OOPS;

import OOPS.MyPackage1.MyClass;
import OOPS.MyPackage1.Rectangle;
import OOPS.MyPackage1.Square;


public class Encapsu {
    public static void main(String[] args) {
        // Employee manager = new Employee("Saamer",90);--> constructor of this object is now private so we cannot use object here.

        Employee manager2 = new Employee(); 

        MyClass myClass = new MyClass();
        myClass.print();
        manager2.setName("ben");
        manager2.setPh(55555);
        // System.out.println(manager2.getName());
        // System.out.println(manager2.getph());


        // SBIread sb = new SBIread();

        // manager.countSalaries();

        // System.out.println(Employee.empId);

        // Me m = new Me();
        // Bhai b = new Bhai();

        // m.surname();
        // m.property();
        // b.surname();
        // b.property();

        Rectangle rect = new Rectangle();
        System.out.println("Rectangle:");
        rect.property(5,7);

        Square s = new Square();
        System.out.println("Square :");
        s.property(5);
    }
}