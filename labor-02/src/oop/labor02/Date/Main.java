package oop.labor02.Date;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("A: ");
        System.out.println(DateUtil.isValidDate(2000,2, 29));
        System.out.println(DateUtil.isValidDate(2000,2, 30));
        System.out.println(DateUtil.isValidDate(1900,2, 29));
        System.out.println(DateUtil.isValidDate(1900,2, 28));
        System.out.println(DateUtil.isValidDate(-1900,2, 28));
        System.out.println(DateUtil.isValidDate(0,2, 28));
        System.out.println(DateUtil.isValidDate(2021,2, 29));
        System.out.println(DateUtil.isValidDate(2020,2, 29));
        System.out.println(DateUtil.isValidDate(2020,1, 32));
        System.out.println(DateUtil.isValidDate(2020,1, 0));
        System.out.println(DateUtil.isValidDate(2020,0, 0));
        System.out.println(DateUtil.isValidDate(2020,4, 31));
        System.out.println(DateUtil.isValidDate(2020,1, 31));


        System.out.println("A (b) alpont: ");
        Random rand = new Random();
        int numInvalidDates = 0;
        for (int i = 0; i < 1000; i++) {
            int year = rand.nextInt(3000)+1;
            int month = rand.nextInt(12)+1;
            int day = rand.nextInt(31)+1;

            try{
                MyDate date = new MyDate(year, month, day);
                System.out.println(date);
            }catch(IllegalArgumentException e){
                numInvalidDates++;
            }
        }
        System.out.println("Number of invalid dates: "+numInvalidDates);
    }
    }
