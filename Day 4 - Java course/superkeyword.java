/* 
  Super = Keyword refers t the superclass (parent class) of an object very similar to the
          "this keyword"
 */

public class superkeyword {
  public static void main(String[] args){
   Hero hero1 = new Hero("Batman",34,"$$$");
   Hero hero2 = new Hero("Superman",56,"^^^");
   System.out.println(hero1.name);
   System.out.println(hero1.age);
   System.out.println(hero1.power);
   System.out.println(hero2.toString());
  }
}

class Person{
  String name;
  int age;

  Person(String name,int age){ //Person() is construct here
    this.name = name;
    this.age = age;
  }

  public String toString(){
    return this.name + "\n" +this.age+ "\n";
  }
}

class Hero extends Person{
  String power;
   Hero(String name,int age,String power){ //Hero() is construct here
    super(name,age);//super refers parent class,the Person consruct class will take care to assign name and age 
    this.power = power;//this refers to this class,super refers super class of an object

    /* this and super works in same way,so as we have used super keyword no need to use this keyword
    this.name = name; 
    this.age = age;*/
 }
   public String toString(){
    return super.toString()+this.power;
  }
}


