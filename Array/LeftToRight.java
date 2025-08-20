import java.util.*;
public class LeftToRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int j=k;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
