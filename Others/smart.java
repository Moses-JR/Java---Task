import java.util.*;
public class smart {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0 && n>100){
            System.out.println("Invalid Input");
        }
        else{
             int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int mod=sc.nextInt();
                int primesum=0,nonprimesum=arr[0]+arr[1];
                for(int i=2;i<n;i++){
                    int c=0;
                    for(int j=2;j<=i/2;j++){
                        if(i%j==0){
                            c++;
                            break;
                        }
                    }
                    if(c==0){
                        primesum+=arr[i];
                    }else{
                        nonprimesum+=arr[i];
                    }
                }
                if(mod==0)
                System.out.println("0");
                else
                System.out.println((mod==1)?primesum:nonprimesum);
        }
    }
}
