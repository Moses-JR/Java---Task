import java.util.*;
public class KFrequent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            count[arr[i]]++;
        }
        int k=sc.nextInt();
        for(int i=0;i<10;i++){
            if(count[i]>=k){
                System.out.print(i+" ");
            }
        }
    }
}
