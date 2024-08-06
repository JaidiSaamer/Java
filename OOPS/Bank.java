package OOPS;

// object of abstract class and interface cannot be created.

public abstract class Bank {
    String name;

    abstract void readData();
    abstract void writeData();

}

class Admin extends Bank{
    
    void readData(){

    }

    void writeData(){

    }
}


class Marketing extends Bank{

    @Override
    void readData(){

    }

    @Override
    void writeData(){

    }
}