import java.util.Scanner;

class Series {

    void mul(long n){
        long s=n;
        System.out.print(n+" ");
        for(int i=0;i<9;i++){
            long val=n*10+s;
            System.out.print(val+" ");
            n=val;
        }
    }
}
public class Sample{
    public static void main(String[] args) {
        Series obj=new Series();
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        obj.mul(num);
    }
}