import java.util.*;
public class MissingElementArray {
     public static void main(String[] args) {
    //     int[] arr={2,3,4,5,6,7,8,9,10};
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]+1!=arr[i+1]){
    //             System.out.println(arr[i]+1);
    //         }
    //     }

    
    //GCD
    int a=20,b=28;
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    System.out.println(a);
    }
}
