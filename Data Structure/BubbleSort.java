import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={3,6,3,7,8,2};
        int steps=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                steps++;
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums)+" Steps : "+steps);
    }
}
