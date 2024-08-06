package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass {
    public static void main(String[] args) throws Exception {
        System.out.println("File Handling in Java");
        // File file = new File("abc.txt");
        // file.createNewFile();
        // System.out.println(file.exists());

        // FileWriter fw = new FileWriter("abc.txt");
        // BufferedWriter bw = new BufferedWriter(fw);
        // bw.write("Hi, I am Saamer Jaidi");
        // bw.close();
        
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}
