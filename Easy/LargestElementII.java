// problem statement:find second smallest and second largest element
import java.util.*;
class LargestElementII{
    public static int[] findSecondelement(int arr[]){
        int ans[]=new int[2];
        Arrays.sort(arr);
        ans[0]=arr[1];
        ans[1]=arr[arr.length-2];
        return ans;
    }
    public static void main(String args[]){
      int arr[]={2,5,5,7,3,9,9,0};
      int ans[]=findSecondelement(arr);
      System.out.println("second smallest element is:"+ ans[0]);
      System.out.println("second largest element is:"+ ans[1]);
    }
}