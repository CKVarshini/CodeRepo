/*
  Static = modifier. A single copy of a variable /method is created and shared 
           The class "owns" the static member 
 */

public class statickeywordmodifier {
  public static void main(String[] args) {
    Friend friend1 = new Friend("Joye");
    Friend friend2 = new Friend("Chandler");
    Friend friend3 = new Friend("Monica");
    
    System.out.println(Friend.numberOffFriends);
    Friend.displayFriends();
  }
}

class Friend{
  String name;
  static int numberOffFriends;//all instances of the friend class have to share this ststic varible 
  Friend(String name){
  this.name=name;
  numberOffFriends++;
 }
 static void displayFriends(){
  System.out.println("You have " +numberOffFriends+ " friends");
 }
}
