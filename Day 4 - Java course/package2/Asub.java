package package2;
import package1.*;

public class Asub extends A{
  public static void main(String[] args) {
    C c = new C();
    System.out.println(c.protectedMessage);

    /*
    B b = new B();
    System.out.println(b.privateMessage); -> is not visible because we have added the private access modifier 
  */
}
}
