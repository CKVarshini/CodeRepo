package package2;
import package1.*;

public class C {
  public String publicMessage = "This is public";//anything that uses the public keyword is visible to any pacakge in the project folder
  protected String protectedMessage = "This is protected";
  private String privateMessage = "This is private";
  String defaultMessage = "This is default";
}
