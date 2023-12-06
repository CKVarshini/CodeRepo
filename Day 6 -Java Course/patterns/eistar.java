package patterns;

public class eistar {
  public static void main(String args[]){
    int n=5;
    int number=1;
    //outer lopp 
    for(int i=1;i<=n;i++){
      //inner lopp
      for(int j=1;j<=i;j++){
        System.out.print(number+" ");
        number=number+1;
        
      }        System.out.println();
    }
  }
  
}
