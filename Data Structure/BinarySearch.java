import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr={34,56,78,23,56,67,23,89,45};
        int low=0;
        int high=arr.length;
        Arrays.sort(arr);
        int tar=23;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                System.out.println("Value Found in "+mid+"index");
                break;
            }else if(arr[mid]>tar){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    }
}
