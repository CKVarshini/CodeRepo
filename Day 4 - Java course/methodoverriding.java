/*Method overriding = Declaring a method in sub class,which is already present in parent class.
                      done so that a child  class can give its own implementation
 */
public class methodoverriding {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.speak();

    Dog dog = new Dog();
    dog.speak();
  }
}

class Animal{
  void speak(){
    System.out.println("the animal speaks");
  }
}

//here we are giving Dog class its own implemention of speak method
class Dog extends Animal{
  @Override
 void speak(){
  System.out.println("The dog goes bark");//speak method in dog class consider as overriding method
 }
}


