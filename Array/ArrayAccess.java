import java.util.*;
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[size];
        arr1[arr.length-1]=arr[arr.length-1];
        int j=arr.length-2;
        for(int i=arr.length-1;i>0;i--){
            arr1[j--]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
