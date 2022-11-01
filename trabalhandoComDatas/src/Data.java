import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T11:30:26");
        Instant d06 = Instant.parse("2022-07-20T11:30:26Z");
    
        LocalDate d07 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d08 = LocalDateTime.parse("22/07/2022 01:30", fmt2);

        LocalDate d09 = LocalDate.of(2022, 7, 20);
        LocalDateTime d10 = LocalDateTime.of(2022, 07, 10, 01 , 30);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }

   
}
