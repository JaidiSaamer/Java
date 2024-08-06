package OOPS;

public class DadaG {
    String name = "Salam";
    String surname = "Jaidi";    
}

interface  Father {
    // String name = "Mohammed";
    // int prp = 50_00_000;
    void surname();
}

interface  Mother {
    // String name = "mom";
    // String surname = "Bajhaw";
    // int prop = 2_00_000;
    void property();
}

class Me implements Father,Mother{
    String name = "Saamer";
    public void surname(){
        System.out.println("AL - Jaedy");
    }

    public void property(){
        System.out.println("20l");
    }
}

class Bhai implements Father,Mother {


    public void surname(){
        System.out.println("Bin Sarhan");
    }

    public void property(){
        System.out.println("50k");
    }
}
