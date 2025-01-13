package IO;

import java.io.*;
import java.util.Scanner;

public class Filter {
    String Eingabe;
    String Ausgabe;
    Filter(String pathName, String Ausgabe){
        this.Eingabe = pathName;
        this.Ausgabe = Ausgabe;
    }

    public void filter(){

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.Eingabe));
            PrintWriter writer = new PrintWriter(this.Ausgabe);
            try{
                String line;
                while((line = br.readLine()) != null){

                    if((!line.isEmpty()) && !Character.isLowerCase(line.charAt(0))){
                        writer.println(line);
                    }
                }
            }
            finally {
                br.close();
                writer.flush();
                writer.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden.");
        } catch (IOException e){
            System.out.println("Fehler.");
        }
    }

    public static void main(String[] args){
        String input = "/Users/maltescharf/Documents/Programming Projects/Java-Miscellaneous/IO/Input.txt";
        String output = "/Users/maltescharf/Documents/Programming Projects/Java-Miscellaneous/IO/Output.txt";

        Filter filter = new Filter(input,output);
        filter.filter();
    }
}
