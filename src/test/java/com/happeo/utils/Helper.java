package com.happeo.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author in-vinaykumar.gupta on 16/09/21
 * @project IntelliJ IDEA
 */
public class Helper {

    public static String getPastDateWithDifferenceToNumberOfDays(int numberOfDays){
        LocalDate today = LocalDate.now();
        LocalDate pastDate = today.minus(Period.ofDays(numberOfDays));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return pastDate.format(formatter);
    }
    public static String getFutureDateWithDifferenceToNumberOfDays(int numberOfDays){
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plus(Period.ofDays(numberOfDays));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return futureDate.format(formatter);
    }
}
