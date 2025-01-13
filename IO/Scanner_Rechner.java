package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_Rechner{
    String path;
    Scanner_Rechner(String path){
        this.path = path;
    }

    long addiere() throws FileNotFoundException {
        long result = 0;
        try{
            Scanner scanner = new Scanner(new FileReader(this.path));
            String line;
            while ((line = scanner.next()) != null){
                System.out.println(result);
                result += Long.valueOf(line);
            }
        }
        catch (IOException e){
            System.out.println("Fehler beim Einlesen");
        }

        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/maltescharf/Documents/Programming Projects/Java-Miscellaneous/IO/Input.txt";
        Rechner rechner = new Rechner(path);
        System.out.println(rechner.addiere());

    }

}
