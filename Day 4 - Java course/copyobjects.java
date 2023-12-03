public class copyobjects {
  public static void main(String[] args) {
    Car car1 = new Car("Hyundai", "Verna", 2023);
    //Car car2 = new Car("Ford", "Mustang", 2022);
    //car2.copy(car1);
    Car car2 = new Car(car1);
    System.out.println(car1);
    System.out.println(car2);
    System.out.println();
    System.out.println(car1.getModel());
    System.out.println(car1.getMake());
    System.out.println(car1.getYear());
    System.out.println();
    System.out.println(car2.getModel());
    System.out.println(car2.getMake());
    System.out.println(car2.getYear());
  }
}

class Car{
  private String make;
  private String model;
  private int year;

  /*
  Car(String make,String model,int year){
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

  Car(Car x){
    this.copy(x);
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

  public void copy(Car x){
    this.setMake(x.getMake());
    this.setModel(x.getModel());
    this.setYear(x.getYear());
  }
}



