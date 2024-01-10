/*
 You are given a circle represented as (radius, xCenter, yCenter) and an axis-aligned rectangle 
 represented as (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner, 
 and (x2, y2) are the coordinates of the top-right corner of the rectangle.

Return true if the circle and rectangle are overlapped otherwise return false. 
In other words, check if there is any point (xi, yi) that belongs to the circle and the rectangle
at the same time.

Ex 1:
https://assets.leetcode.com/uploads/2020/02/20/sample_4_1728.png
Input: radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1
Output: true
Explanation: Circle and rectangle share the point (1,0).

Example 2:
Input: radius = 1, xCenter = 1, yCenter = 1, x1 = 1, y1 = -3, x2 = 2, y2 = -1
Output: false

Example 3:
https://assets.leetcode.com/uploads/2020/02/20/sample_2_1728.png
Input: radius = 1, xCenter = 0, yCenter = 0, x1 = -1, y1 = 0, x2 = 0, y2 = 1
Output: true
*/

class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX=Math.max(Math.min(xCenter,x2),x1);
        int closestY=Math.max(Math.min(yCenter,y2),y1);

        double distance =Math.sqrt(Math.pow(xCenter - closestX, 2) + Math.pow(yCenter - closestY, 2));

        return distance<=radius;

    }
}


