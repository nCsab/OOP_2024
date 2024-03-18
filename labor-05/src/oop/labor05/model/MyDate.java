package oop.labor05.model;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDays = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if (month == 2) {
            maxDays = (leapYear(year) ? 29 : 28);
        }
        return day <= maxDays;
    }

    public static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
