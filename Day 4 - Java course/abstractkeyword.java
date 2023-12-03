// Abstract = abstract classes cannot be instantiated ,but they can have a subclass 
//             abstract methods are declared without an implementation

public class abstractkeyword {
  public static void main(String[] args) {
    //Vehicle vehicle =  new Vehicle(); -> as Vechile is an abstract class it cant be instantiated
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    car.go();
    bicycle.stop();

  }
}

abstract class Vehicle{
  abstract void go();
  abstract void stop();
}

class Car extends Vehicle{
 @Override
  void go(){
  System.out.println("The driving is driving the car");
 }

 void stop(){
    System.out.println("The car is stopped");
  }
}

class Bicycle extends Vehicle{
  @Override

  void go(){
  System.out.println("The bicycle is moving");
 }
  void stop(){
    System.out.println("The bicycle is stopped");
  }
}