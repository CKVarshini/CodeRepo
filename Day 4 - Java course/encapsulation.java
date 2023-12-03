/*
  ENCAPLUSATION = attributes of a class will be hidden or private,
                  Can be accessed only through methods (getters & setters)
                  You should make attributes private if you dont havr a reason to make them public/protrcted
 */
public class encapsulation {
  public static void main(String[] args) {
    Car car = new Car("Hyundai","Verna",2023);
    car.setYear(2022);

   System.out.println(car.getModel());
   System.out.println(car.getMake());
   System.out.println(car.getYear());
 }
}

class Car{
  private String make;
  private String model;
  private int year;

  /*Car(String make,String model,int year){
    this.make = make;
    this.model = model;
    this.year = year;
  }
  */

  Car(String make,String model,int year){
    this.setMake(make);
    this.setModel(model);
    this.setYear(year);
  }

  public String getMake(){
    return make;
  }

  public String getModel(){
    return model;
  }

  public int getYear(){
    return year;
  }

  public void setMake(String make){
    this.make = make;
  }

  public void setModel(String model){
    this.model = model;
  }

  public void setYear(int year){
    this.year = year;
  }
}


