import java.util.*;
//grt bit
public class getbit {
  public static void main(String args[]){
    int n=5;  //5 binary conversion=0101
    int pos=2;
    int bitMask= 1<<pos;
  

    if((bitMask & n)==0){
      System.out.println("Bit was zero");
    }
    else{
      System.out.println("Bit was one");
      
    }
  }
}



