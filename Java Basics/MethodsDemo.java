public class MethodsDemo {
// Methods in java
/*   4 types of methods
 *          1) non return-type
 *          2) non return-type with parameters
 *          3) return-type
 *          4) return-type with parameters
 *  syntax :
 *      type  nameOf_Function () {  // block of code}
        nameOf_Function();   // calling function
 */
//      1) non return-type
        static void myMethod(){
            System.out.println("Hi, i am method");
        }

//      2) non return-type with parameters
        static void coding(int paisa){
            System.out.println("Mota Paisa");
        }

//      3) return-type
        static int myRetMeth(){
            System.out.println("Hi, i am return type method");
            return 0;
        }

//      4) return-type with parameters
        static String myFriend(String loc){
            System.out.println("Hi, i am return type method with parameters");
            return "Shaandaar";
        }

public static void main(String[] args) {
    // calling a method
    myMethod();

    // calling a method by creating object
    // MethodsDemo obj = new MethodsDemo();
    // obj.myMethod();

    coding(1000);

    int rvalue = myRetMeth();
    System.out.println("Return value of method :"+rvalue);

    System.out.println(myFriend("Baazaar"));

}
}
