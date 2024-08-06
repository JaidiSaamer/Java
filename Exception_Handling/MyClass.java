package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

// import java.util.ArrayList;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

class Student{
    static void pass(int marks) throws MyException{
        if(marks < 30){
            throw new MyException("Student is failed!");
        }
    }
}

public class MyClass {
    public static void myFiles() throws Exception{
        FileReader fl = new FileReader("xyz.txt");
    }
    public static void main(String[] args) throws Exception {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        // System.out.println(4/0);  --> Runtime Exception
        System.out.println(5);
        System.out.println(6);
        // FileReader f1 = new FileReader("abc.txt");  -->Compiletime Exception

        // int arr[] = {1,2,};
        // System.out.println(arr[3]);  //-->ArrayIndexOutOfBoundException

        // String l = null;
        // System.out.println(l.length()); -->NullPointerException

        // Error
        // ArrayList<Integer> al = new ArrayList<>();
        // while (true) {
        //     al.add(1);    
        // }


        /*  Types of Exceptions: 
        1)Checked Exception / Compile time exception
         ex:- File not found ,SQL Exception, IO Exception, Class not found exception
        2)Un-Checked Exception / Runtime exception
         ex:- ArrayIndexOutOfBound Exception, NullPointer Exception, Arithmetic Exception, IllegalThread Exception
        */


        // try,try_resources  from java 7
        int arr[] = {1,2,};
        try{
            Student.pass(17);
        }catch(MyException e ){
            System.out.println(e);
        }
        // try(FileReader fl = new FileReader("xyz.txt");
        // BufferedReader bf = new BufferedReader(fl);){
            
        //     String line;
        //     while ((line = bf.readLine())!= null) {
        //         System.out.println(line);
        //     }
        //     // System.out.println(4/0);
        //     System.out.println(arr[3]);
        // }
        // // catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
        // //     System.out.println(e);
        // // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("From finally");
        // }
        

        // try block from java 9
        Scanner scan = new Scanner(System.in);
        try(scan){

        }catch(Exception e){
            System.out.println(e);
        }


        // throws keyword is used with the methods.
        // FileReader fl = new FileReader("xyz.txt");
        // myFiles();

        // throw --> it will throw an exception
        throw new Exception("Nikal Bhootni K");

        
    }
    
}
