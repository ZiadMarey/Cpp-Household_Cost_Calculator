import java.util.Scanner;

public class Birthday {

    private int year;
    private int day;
    private Month monat;
    String month;
    public Birthday(int day,Month monat , int year) {
        this.year = year;
        this.day = day;
        this.monat = monat;
    }

    public void setYear(int year){this.year = year;}
    public void setDay(int day){
        this.day = day;
        if(this.day < monat.getI()){
            System.out.println("Wrong day of Month");
        }
    }
    public int getDays(){return this.day;}
    public int getYear(){return this.year;}
    public Month getMonth(){return monat;}
    public void setMonth(Month month){this.monat = month;}
}
