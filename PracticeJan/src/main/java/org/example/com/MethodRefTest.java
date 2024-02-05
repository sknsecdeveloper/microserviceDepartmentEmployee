package org.example.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodRefTest {

    public static void main(String[] args) {


        List<Double> numbers = Arrays.asList(5.0, 3.0, 50.1, 24.2, 40.2, 2.2, 9.2, 18.2);

        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("------------------");
        numbers.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);

        System.out.println("------------------");
        numbers.stream().sorted(Double::compareTo).forEach(System.out::println);

        List<String> strings = Arrays.asList("a","c","a","z","f");

        strings.stream().sorted().forEach(System.out::println);

        strings.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime.getZone());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // convert to ddMMyyyy
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = dateTimeFormatter.format(localDateTime);
        System.out.println(formattedDate);

        String europeanDatePattern = "dd.MM.yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        System.out.println(europeanDateFormatter.format(LocalDate.of(2016, 7, 31)));

        String myDate = "31.07.2016";
        LocalDate myLocalDate = LocalDate.parse(myDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(myLocalDate);

        System.out.println(LocalDate.now());



         Optional<List<String>> stringsOptional =  Optional.of(null);
        System.out.println(stringsOptional.isPresent());

        //Optional.empty().orElseThrow();

        System.out.println( Optional.ofNullable(null));

       // System.out.println(Optional.empty().get());




    }
}
