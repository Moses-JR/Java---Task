import java.util.*;
public class FrequentDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<3;i++){
            int n=sc.nextInt();
            while(n>0){
                int rem=n%10;
                arr[rem]++;
                n/=10;
            }
        }
        int high=0;
        for(int i=0;i<10;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }
        for(int i=0;i<10;i++){
            if(high==arr[i]){
                System.out.println(i);
            }
        }

    }
}
