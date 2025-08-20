import java.util.Scanner;
import java.util.HashSet;
public class HappyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> list=new HashSet<>();
        while(n>0){
            if(list.contains(n)){
                System.out.print("Not Happy Number");
                break;
            }else{
                list.add(n);
            }
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            if(sum==1){
                System.out.print("Happy Number");
                break;
            }else {
                n=sum;
            }
        }
        sc.close();
    }
}
