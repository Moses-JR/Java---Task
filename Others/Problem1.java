import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the training days");
        int n=sc.nextInt();
        for(int k=1;k<=n;k++){
        if(k%2==0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i*4);
                }
                System.out.println();
            }
        }else{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i*3);
                }
                System.out.println();
            }
        }
    }
}}
