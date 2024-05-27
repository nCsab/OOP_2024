package oop.labor13;

public class Date {
    private int year;
    private int month;
    private int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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

    public void setYear(int year) {
        if(year>0){
        this.year = year;}
        else {
            throw new IllegalArgumentException("Nem pozitiv ev");

        }
    }

    public void setMonth(int month) {
       if(month >0 && month<=12){
        this.month = month;
    }else {
           throw new IllegalArgumentException("Nem pozitiv ho");
       }}

    public void setDay(int day) {
           if(day>0 && day<=31) {
               this.day = day;
           }
           else {
               throw new IllegalArgumentException("Nem jo nap");
           }
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + String.format("%02d",month) +
                ", day=" + String.format("%02d",day) +
                '}';
    }
}
