package IO;

import java.io.*;

public class Rechner {
    String path;
    Rechner(String path){
        this.path = path;
    }

    long addiere() throws FileNotFoundException {
        long result = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(this.path));
            String line;

            try {
                while ((line = br.readLine()) != null){
                    result += Long.valueOf(line);
                }
            } finally {
                br.close();
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
        rechner.addiere();

    }
}
