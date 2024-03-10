package oop.labor02.Date;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year % 4 == 0){
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day){
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31){
            return false;
        }
        if(month == 2){
            if (leapYear(year)){
                return day <= 29;
            }
            return day <= 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11){
            return day <= 30;
        }
        return true;
    }
}
