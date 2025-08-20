import java.util.*;
public class NonRepeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int[] arr=new int[10];
        while(temp>0){
            int rem=temp%10;
            arr[rem]++;
            temp/=10;
        }int count=0;
        for(int i=0;i<10;i++){
            if(arr[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
