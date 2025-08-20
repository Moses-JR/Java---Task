import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        int[] nums={7,4,3,2,1,5};
        int mid;
        int temp;
        for(int i=0;i<nums.length-1;i++){
            mid=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[mid]>nums[j]){
                    mid=j;
                }
            }
            temp = nums[mid];
            nums[mid]=nums[i];
            nums[i]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
