package oop.labor10.Lab10_02;

class DateUtil {
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12)
            return false;

        int daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = (leapYear(year)) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }

        return day >= 1 && day <= daysInMonth;
    }
}
