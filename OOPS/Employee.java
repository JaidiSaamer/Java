package OOPS;

class Employee{
    // static int empId = 2; --> with the use of    static keyword we can access a variable gobally,means we can access it in whole program.As per our need.
    private int empId = 2;
    private int ph = 72910;
    private String name = "Programmer";
    private int basicSal = 20_000;
    private int incentive = 200;

// when we create a private constructor then we cannot create its object.It is used when we dont want to give access to other classes.
    Employee(){
        ph = 22222;
        name = "sam";
    }

    Employee(String empName,int empPh){
        name = empName;
        ph = empPh;
    }

    private void countSalaries(){
        System.out.println(basicSal + incentive);
    }

    // getter & setter
    int getph(){
        return ph;
    }

    String getName(){
        return name;
    }

    void setPh(int phone){
        ph = phone;
    }
    void setName(String name){
        this.name = name;
    }
}
