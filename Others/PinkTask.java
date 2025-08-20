import java.util.*;
public class PinkTask {
    //Even Series
    static void evenseries(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Even Series");
        int n=sc.nextInt();
        for(int i=2;i<=n;i+=2){
            System.out.print(i+" ");
        }
    }
    //Odd Series
    static void oddseries(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Odd Series");
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
        }
    }
    //Pattern
    static void pattern(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Pattern Series");
        int n=sc.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(n);
         }
         System.out.print(" ");
       }
    }
    //Series
    static void series(){
        System.out.println("Increase and Decrease Series");
        int j=1;
        for(int i=10;i>0;i--){
            System.out.print(i+" ");
            while(i!=0){
                System.out.print(j++ +" ");
                break;
            }
        }
    }
    //Quadratic Sequence
    static void quadratic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Quadratic Seqence");
        int n=sc.nextInt();
        int sum=1,j=0;
        for(int i=1;i<=n;i++){
            sum+=j++;
            System.out.print(sum+" ");
        }
    }
    //Cubic Series
    static void cubic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Cubic Series");
        int n=sc.nextInt();
        int val=0;
        for(int i=1;i<=n;i++){
            val=i*i*i+1;
            System.out.print(val+" ");
        }
    }
    //Geometric Series
    static void geometric(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Geometric Series");
        int n=sc.nextInt();
        int val=1;
        System.out.print(val+" ");
        for(int i=2;i<=n;i++){
            val*=2;
            System.out.print(val+" ");
        }
    }
    //Arithmetic Series
    static void arithmetic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Arithmetic Series");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(i*5+" ");
        }
        
    }
    //Fibonacci Series
    static void fibonacci(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci Series");
        int n=sc.nextInt();
        int n1=0,n2=1;
        System.out.print("0 1 ");
        for(int i=3;i<=n;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
    //Prime Numbers
    static void prime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Prime Series");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int c=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.print(i+" ");
            }
        }
    }
    //Triangular Series
    static void triangula(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Triangula Series");
        int n=sc.nextInt();
        int sum=1,j=2;
        System.out.print(sum+" ");
        for(int i=1;i<n;i++){
            sum+=j++;
            System.out.print(sum+" ");
        }
    }
    //Series1
    static void series1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for  Series1");
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<=n;i++){
                j++;
                System.out.print(j+" ");
                if(i%3==0){
                    j-=2;
                }
            
        }
    }
    public static void main(String[] args) {
    evenseries();
    System.out.println();
    oddseries();
    System.out.println();
    pattern();
    System.out.println();
    series();
    System.out.println();
    quadratic();
    System.out.println();
    cubic();
    System.out.println();
    geometric();
    System.out.println();
    arithmetic();
    System.out.println();
    fibonacci();
    System.out.println();
    prime();
    System.out.println();
    triangula();
    System.out.println();
    series1();
    }
}
