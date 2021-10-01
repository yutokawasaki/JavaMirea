package Lab8;

import java.io.*;

public class TestFileReader {
    public static void main(String[] args) throws IOException{
        File f = new File("123.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        System.out.println(fin.readLine());

    }
}