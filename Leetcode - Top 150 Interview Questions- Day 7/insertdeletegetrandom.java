/*
 Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.

 

Example 1:

Input
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]
Output
[null, true, false, true, 2, true, false, 2]

Explanation
RandomizedSet randomizedSet = new RandomizedSet();
randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
randomizedSet.insert(2); // 2 was already in the set, so return false.
randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
 

Constraints:

-231 <= val <= 231 - 1
At most 2 * 105 calls will be made to insert, remove, and getRandom.
There will be at least one element in the data structure when getRandom is called.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
  List<Integer> list;
  HashMap<Integer,Integer> map; //Hashmap contains Key-value pair
  Random random = new Random(); //to get random objects

  public RandomizedSet() {
      list = new ArrayList<Integer>(); //initializing array list
      map = new HashMap<Integer,Integer>();//initilaizing HashMap,so every input the 1st method it is going to be called is  RandomizedSet() constructor

  }
  
  public boolean insert(int val) {
   if(map.containsKey(val)){
    return false;//if item is present
   } 
   //if item is not present we have to add the item into the list and hashmap .then finally return true
    map.put(val,list.size());//adding val as key into the map and list.size() initilaizing size->this will gives us the index position
    list.add(val);
    return true;
     
  }
  
  public boolean remove(int val) {
      if(!map.containsKey(val)){
       return false;//if item was not present present
      }
      int pos = map.get(val);//reterving the index position,to see where the element is present inside the map 
      if(pos != (list.size()-1)){ //to check if this position is not the last index position inside the list
        int lastElement = list.get(list.size()-1);//getting last ele from the list
        list.set(pos,lastElement);//adding lastele to particular index position
        map.put(lastElement,pos);//to update the position of lastelement inside the map
        }
      map.remove(val);
      list.remove(list.size()-1);
      return true;
      
  }
  
  public int getRandom() {
      //nextInt method : this will give us a number b/w 0(inclusive) and parameter(exclusive)
      //for ex if list size is 5 ,then  random.nextInt= will give us the interger from 0-4(5 is exclusive )
   int randomInt = random.nextInt(list.size());
   return list.get(randomInt);//will pick one randon integer from the list 
      
  }
}

/**
* Your RandomizedSet object will be instantiated and called as such:
* RandomizedSet obj = new RandomizedSet();
* boolean param_1 = obj.insert(val);
* boolean param_2 = obj.remove(val);
* int param_3 = obj.getRandom();
*/