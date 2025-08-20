import java.util.*;
public class Factorial {
    static int a=0;
    static int b=1;
    static int sum(int n){
        if(n!=1)
            n=n*sum(n-1);
        return n;
    }
    static int reverse(int num){
        if(num>0){
            int rem=num%10;
            return rem+reverse(num/10);
        }
        return 0;
    }
    static int fib(int n){
        
        if(a<n){
            return fib(a+1)+fib(b+2);
        }

        return 2;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        // System.out.print(sum(num));
        //System.out.println(reverse(num));
        System.out.println(fib(num));
    }
}
