package fuctions;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

import javax.naming.NamingException;

public class agecalculation {
  public static int agecalculater(int age,int year)
  {
    //int currentYear = new Date(System.currentTimeMillis()).getYear();
    //Calendar calendar = Calendar.getInstance();
    //calendar.setTime(new Date(System.currentTimeMillis()));
    LocalDate localDate=LocalDate.now();
    int year1 =localDate.getYear();
    System.out.println("Current year is : " +year1);
    System.out.println("Your age at " + year + " will be : ");
   return(age+(year-year1));
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your current age:");
    
    int age=sc.nextInt();
    System.out.println("Enter the year:");
    int year=sc.nextInt();
   

    //agecalculater(age, year);
    
    System.out.println(agecalculater(age, year));
  }
  
}
