// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        for(int i=2;i<=n;i++){
            int rem=i%10;
            int c=0;
            if(rem!=3){
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        c++;
                    }
                }
                if(c==0){
                	System.out.print(i+" ");
                
            }
            }
        }
    }
}