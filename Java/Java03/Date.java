package Java03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String input = sc.nextLine();
        LocalDate currentDate = LocalDate.parse(input, formatter);
        System.out.println("CurrentDate is: "+ currentDate);

        LocalDate futureDate = currentDate.plusDays(30);
        System.out.println("FutureDate is: "+ futureDate);
        String day = futureDate.getDayOfWeek().toString();
        System.out.print("Day of futureDate is: "+day);

        
    }
    
}