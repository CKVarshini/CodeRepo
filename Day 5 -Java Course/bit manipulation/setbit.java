public class setbit {
  //set one

  public static void main(String args[]){
    int n=5;  //5 binary conversion=0101
    int pos=1;
    int bitMask= 1<<pos;

    int newnumber=bitMask  |n;
    System.out.println(newnumber);
  }

}
