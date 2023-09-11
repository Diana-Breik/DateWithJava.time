package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Schritt 1: Schreibe Code, um das aktuelle Datum und die aktuelle Uhrzeit auszugeben.
        //System.out.println("the current date and time: "+ Instant.now());//uneindeutig da es gibt 3 Stunden Unterschied.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("the current date and time: "+ localDateTime);// Ausgabe des aktuellen Datum und der aktuellen Uhrzeit


        //Schritt 2: Füge dem aktuellen Datum eine Zeitspanne von 2 Wochen hinzu und gib das neue Datum aus.
        /* LocalDateTime newdate = localDateTime.plus(2, ChronoUnit.WEEKS);
        System.out.println("the new date is: "+ newdate);*/
        LocalDateTime newlocalDateTime = localDateTime.plusWeeks(2);
        System.out.println("the new date after adding 2 weeks is: "+ newlocalDateTime);


        System.out.println("--------------------");


        //Schritt 3: Vergleiche das aktuelle Datum mit einem festgelegten zukünftigen Datum und gib aus, ob das aktuelle Datum vor oder nach dem festgelegten Datum liegt.
        LocalDateTime futureDate = LocalDateTime.of(2023,12,30,15,33);
        if(localDateTime.isAfter(futureDate)){
            System.out.println("the current date is after the specified date");
        }
        else{
            System.out.println("the current date is before the specified date");
        }


        System.out.println("--------------------");


       //Schritt 4: Berechne die Differenz in Tagen zwischen zwei beliebigen Daten und gib das Ergebnis aus.
        LocalDate localDate1 = LocalDate.of(2023, 9, 11);
        LocalDate localDate2 = LocalDate.of(2001, 1, 26);
        long different = ChronoUnit.DAYS.between(localDate2,localDate1);//  zweiter Parameter - erster Parameter
        System.out.println("the difference between two dates is: " + different);

        System.out.println("---------Bonus-Aufgaben-----------");

        Animal animal = new Animal("Mischu",(LocalDate.of(2011,9,24)));

        System.out.println("the numbers of days until the next birthday of this animal: " + animal.numberOfDaysUntilNextBirthday());


    }
}