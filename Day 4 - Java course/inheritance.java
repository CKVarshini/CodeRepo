/*
  Inheritance = the process where one class acquires the attributes and methods of another 
   */

public class inheritance {
  public static void main(String[] args){
    Car car = new Car();
    car.go();

    Bicycle bike = new Bicycle();
    bike.stop();

    System.out.println(car.speed);
    System.out.println(bike.speed);

    System.out.println(car.doors);
    System.out.println(bike.pedals);
  }
}

//Vehicle is "super class or parent class"
class Vehicle{
  double speed;
  void go(){
    System.out.println("This vehicle is moving");
  }
  void stop(){
    System.out.println("This vehicle is stopped");
  }
}

//Now Car class and Bicycle class are the subclasses of Vehicle class also called as "child class or sub class" 
class Car extends Vehicle{
 int wheels = 4;
 int doors = 2;
}

class Bicycle extends Vehicle{
 int wheels = 2;
 int pedals = 2;
}
