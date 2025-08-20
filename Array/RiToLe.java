import java.util.*;
public class LeToRi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=arr[arr.length-1];
            for(int j=0;j<arr.length-1;j++){
            arr[j+1]=arr[j];
            System.out.println(Arrays.toString(arr));
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
