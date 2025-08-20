import java.util.*;
public class UniqueDigit {
    public static void main(String[] args){
        HashSet<Integer> arr=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
           int  n=sc.nextInt();
            while(n>0){
                int rem=n%10;
                arr.add(rem);
                n/=10;
            }
        }
        System.out.print(arr.size());
    }
}
