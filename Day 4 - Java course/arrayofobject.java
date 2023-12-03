public class arrayofobject {
public static void main(String[] args){
  
  food[] plate = new food[3];
  
  food food1 = new food("pizza");
  food food2 = new food("burger");
  food food3 = new food("fries");

  plate[0] = food1;
  plate[1] = food2;
  plate[2] = food3;

  //System.out.println(plate[0]); this returns memomy location of food object 
  
  System.out.println(plate[0].name);
  System.out.println(plate[1].name);
  System.out.println(plate[2].name);

  /* Instead of declaring array of food object ans setting a memory size ,we can declare
     an array of food object ans assing value right away
      
     food food1 = new food("pizza");
     food food2 = new food("burger");
     food food3 = new food("fries");

     food[] plate = {food1,food2,food3};
   */
 }
}

class food{
  String name;
  food(String name){
    this.name = name;
  }
}
