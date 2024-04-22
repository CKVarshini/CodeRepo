/*
 Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
  public int[][] merge(int[][] intervals) {
      if(intervals.length<=1)
      return intervals;

      // Sort the array in ascending order by comporing first element in each interval i.e intervals[0]
      Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

      List<int[]> result = new ArrayList<>();

      int[] newInterval = intervals[0];
      result.add(newInterval);

      for(int[] interval : intervals){
          if(interval[0]<=newInterval[1])
          newInterval[1]=Math.max(newInterval[1],interval[1]);

          else{
              newInterval= interval;
              result.add(newInterval);
          }

      }
      return result.toArray(new int[result.size()][]);
  }
}