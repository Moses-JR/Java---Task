import java.util.*;
public class PrimePyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0,a=0;
        for(int i=2;i<=30;i++){
            int c=0;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                a++;
            }
        }
        int[] arr=new int[a];

        int m=0;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(arr[m++]+" ");
                }
            System.out.println();
        }
    }
}