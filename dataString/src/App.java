import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class App {
    public static void main(String[] args) throws Exception {
       
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); 
       
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("D01 = " + d01.format(fmt1));
        System.out.println("D02 = " + d02.format(fmt2));
        System.out.println("D03 = " + fmt3.format(d03));

        // Usando padrões pre definidos na documentação do DateTimeFormatter
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
        System.out.println("Padrão iso_date: " + d01.format(fmt4));

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Padrão iso_date_time:  " + d02.format(fmt5));

        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("Padrão iso_instant: " + fmt6.format(d03));

        //Converter data-hora local para global.
        System.out.println();
        System.out.println("Converter data hora local para global");
        LocalDateTime r1 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println(r1);  
        
        //Pegando dia de uma data local.
        System.out.println("d01 dia = " + d02.getDayOfMonth());

        //Pegando mes de uma data local.
        System.out.println("d01 mês = " + d02.getMonthValue());

        //Pegando ano de uma data local.
         System.out.println("d01 ano = " + d02.getYear());

        //Pegando hora de uma data local.
        System.out.println("d01 Hora = " + d02.getHour());

        //Pegando minutos de uma data local.
        int minuto = d02.getMinute();       
        if(minuto < 10){
            System.out.println("d01 minuto = " +"00:" + d02.getMinute());
        }else{
            System.out.println("d01 minuto = " + d02.getMinute());
        }


        //Cálculos com data-hora
        System.out.println("Cálcuos com data-hora.");
        System.out.println();
        System.out.println("Usando LocalDate:");
        LocalDate semanaPassada = d01.minusDays(7);
        LocalDate proximaSemana = d01.plusDays(7);
        System.out.println("Menos 7 dias da data atual: " + semanaPassada);
        System.out.println("Mais 7 dias da data autal: " + proximaSemana);


        System.out.println();
        System.out.println("Usando Instant");
        Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);
        System.out.println("Menos 7 dias da data atual: " + semanaPassadaInstant);
        System.out.println("Mais 7 dias da data autal: " + proximaSemanaInstant);


        //Calculando duração
        LocalDate d04 = LocalDate.parse("2022-10-27");
        Duration t1 = Duration.between(d04.atStartOfDay(), d01.atStartOfDay());
        System.out.println("LodalDate: " + t1.toDays());

        LocalDateTime d05 = LocalDateTime.of(2022,10,27,0,0);
        Duration t2 = Duration.between(d05,d02);
        System.out.println("LocalDateTima: " + t2.toDays());

        Duration t3 = Duration.between(semanaPassadaInstant,d03);
        System.out.println("Instant: " + t3.toDays());
    }
}
