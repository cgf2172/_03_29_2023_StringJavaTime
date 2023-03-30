package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ProbarJavaTime {
    public static void main(String[] args) {
        //Primera forma de fecha
        LocalDate date= LocalDate.of(1992, Month.AUGUST , 30);
        System.out.println("Fecha: "+date);
        //Segunda forma de fecha
        LocalDate date2= LocalDate.of(1992, Month.AUGUST, 30);
        System.out.println("Fecha: "+date2);
        System.out.println(date.plusDays(2));
        System.out.println(date2.plusMonths(1));
        System.out.println(date2.plusYears(1));
        System.out.println(date2.minusDays(2));
        System.out.println(date2.minusMonths(1));
        System.out.println(date2.minusYears(1));
        LocalDate date3= LocalDate.of(2007, Month.JULY,7 );
        System.out.println(date2.isBefore(date3));
        System.out.println(date2.isAfter(date3));
        System.out.println(Period.between(date2, date3));
        System.out.println(Period.between(date3, date2).getYears());
        System.out.println(Period.between(date3, date2).getMonths());
        System.out.println(Period.between(date3, date2).getDays());

    }

}
