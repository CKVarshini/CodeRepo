public class removeduplicatesfromsortedarray {
  public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j])
            {
               arr[i+1]= arr[j];
                i++;
                
            }
        }
        return i+1;
    }
}
}
