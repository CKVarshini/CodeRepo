/*
 There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

 

Example 1:

Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
Example 2:

Input: points = [[1,2],[3,4],[5,6],[7,8]]
Output: 4
Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
Example 3:

Input: points = [[1,2],[2,3],[3,4],[4,5]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
- Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
 

Constraints:

1 <= points.length <= 105
points[i].length == 2
-231 <= xstart < xend <= 231 - 1

 */

 import java.util.Arrays;
 import java.util.Comparator;
 
 class Solution {
     public int findMinArrowShots(int[][] points) {
         if (points.length == 0) return 0;
 
         // Sort the balloons based on their end points (xend)
         Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
 
         int end = points[0][1]; // End point of the first interval
         int arrows = 1; // Initialize arrows count
 
         // Iterate through the sorted balloons
         for (int i = 1; i < points.length; i++) {
             // If the start point of the current balloon is greater than end, shoot a new arrow
             if (points[i][0] > end) {
                 arrows++;
                 end = points[i][1];
             }
             // If there's overlap, continue to the next balloon
         }
 
         return arrows;
     }
 }
 
/*class Solution {
    public int findMinArrowShots(int[][] points) {
         // Sort the points array based on the start points of each interval
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int n = points.length;

        int[] prev = points[0];
        int count = 1;
        for(int i=1;i<n;i++){
            int currentStartPoint = points[i][0];
            int currentEndPoint = points[i][1];

            int prevStartPoint = prev[0];
            int prevEndPoint = prev[1];
            
            //no overlap condition
            if(currentStartPoint>prevEndPoint){
                count++;
                prev=points[i];
            }
            //overlap condition
            else{
                 prev[0] = Math.max(currentStartPoint,prevStartPoint);
                 prev[1] = Math.min(currentEndPoint,prevEndPoint);
            }
        }
        return count;
    }
}
*/
