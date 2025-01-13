package API;
import java.time.Year;
import java.time.Year.*;

public class leapYears {
    public static void printLeapYears(int fromYear, int toYear){
       // Year year = Year.of(fromYear);
        for (int i = fromYear; i<=toYear;i++){
            if (Year.of(i).isLeap())    System.out.println(i);
        }
    }

   public static void main(String[] args){
        leapYears.printLeapYears(2000,2025);
   }
}
