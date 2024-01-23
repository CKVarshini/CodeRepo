/*
 You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.

Each minute, a node becomes infected if:

The node is currently uninfected.
The node is adjacent to an infected node.
Return the number of minutes needed for the entire tree to be infected.

 

Example 1:


Input: root = [1,5,3,null,4,10,6,9,2], start = 3
Output: 4
Explanation: The following nodes are infected during:
- Minute 0: Node 3
- Minute 1: Nodes 1, 10 and 6
- Minute 2: Node 5
- Minute 3: Node 4
- Minute 4: Nodes 9 and 2
It takes 4 minutes for the whole tree to be infected so we return 4.
Example 2:


Input: root = [1], start = 1
Output: 0
Explanation: At minute 0, the only node in the tree is infected so we return 0.
 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public int amountOfTime(TreeNode root, int start) {
      Map<Integer,Set<Integer>>map=new HashMap<>();
      convertTreetoGraph(root,0,map);
      Queue<Integer> queue = new LinkedList<>();//to implement BFS,queue will process node set so it containes intergers
      queue.add(start);
      Set<Integer> visited = new HashSet<>();
      visited.add(start);
      int minutes=0;
      while(!queue.isEmpty()){ //run while loop until queue is empty
         int levelSize = queue.size();
         while(levelSize > 0){
             int current = queue.poll();//to pull out the accessed elements from the queue, we use poll method here
             for (int num:map.get(current)) {//using num .we will access one element at a time
             if(!visited.contains(num)){
                 queue.add(num);
                 visited.add(num);
              }
            }
             levelSize--;
         }
         minutes++;

      }
      return minutes-1;//at zero th minute it will start infecting ,so we have to reduce a total minutes by one ,because we have not counted the zeroth minute (ex 2) 


      
  }
  //Converting tree to graoh
  private void convertTreetoGraph(TreeNode current,int parent,Map<Integer,Set<Integer>>map){
      if(current !=null){
          if(!map.containsKey(current.val)){
              map.put(current.val,new HashSet<>());//HashSet<>():adjacent nodes set is formed
          }
          Set<Integer> adjacentList = map.get(current.val);
          if(parent!=0){
              adjacentList.add(parent);
          }
          if(current.left!=null){
               adjacentList.add(current.left.val);

          }
           if(current.right!=null){
               adjacentList.add(current.right.val);
         }
          convertTreetoGraph(current.left,current.val,map);////current.val:parent of lrft child 
          convertTreetoGraph(current.right,current.val,map);//current.val:parent of right child 
          }

      }
  }
