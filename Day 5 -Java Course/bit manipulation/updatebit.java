import java.util.Scanner;

public class updatebit {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int operation=sc.nextInt(); 
    //operation=1 => set(or opration)
    //operation=0 =>clear(and with not(~))
    int n=5;  //5 binary conversion=0101
    int pos=1;
    int bitMask= 1<<pos;
    
    if(operation==1){
    //set
    int newnumber=bitMask | n;
    System.out.println(newnumber);//0001=>0010(after left shift) 0010 AND 0101=0111(7 in decimal)
    }
     else{
      int notBitMask=~(bitMask);
      int newnumber=notBitMask & n;
      System.out.println(newnumber);
     }
  }
}

