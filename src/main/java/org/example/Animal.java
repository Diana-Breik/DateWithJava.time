package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Animal {
   private String name;
   private LocalDate birthDay;//die Zeit ist unwichtig in diesem Fall beim Geburtstag, deswegen benutzen wir LocalDate

    public Animal(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public long numberOfDaysUntilNextBirthday(){
        LocalDate localDate = LocalDate.now();
        LocalDate nextBirthDay = birthDay.withYear(localDate.getYear());
        if(nextBirthDay.isBefore(localDate) || nextBirthDay.isEqual(localDate)){
            nextBirthDay = nextBirthDay.plusYears(1);
        }
        long numberOfDays = ChronoUnit.DAYS.between(localDate,nextBirthDay);
        return numberOfDays;
    }
}
