//clear bit
public class clearbit {
  public static void main(String args[]){
    int n=5;  //5 binary conversion=0101
    int pos=2;
    int bitMask= 1<<pos;

    int notBitMAsk=~(bitMask);
    int newnumber=notBitMAsk & n;
    System.out.println(newnumber);
  }
}
