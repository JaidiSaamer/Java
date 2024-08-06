package OOPS;

// object of abstract class and interface cannot be created.

interface  MyBank {
    void write();
    void read();
    //in interface we can declare only,cannot implement.
}

class SBIread implements MyBank{

    @Override
    public void write(){
        System.out.println("SBI read");
    }

    @Override
    public void read(){

    }
}
