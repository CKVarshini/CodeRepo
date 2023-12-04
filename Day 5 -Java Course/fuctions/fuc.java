package fuctions;

import java.util.Scanner;


//print a given name in a fuction 
public class fuc {
public static void printMyName(String name)
{
System.out.println(name);
return;
}
public static void main(String args[]){
  Scanner cs=new Scanner(System.in);
  String name=cs.next();

  printMyName(name);  //call fuction
}
}

