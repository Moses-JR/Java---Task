import java.util.Scanner;
public class Plain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the length of Array");
        int n=sc.nextInt();
        int[] Mark=new int[n];
        System.out.println("Enter the Mark");
        int sum=0;
        for(int i=0;i<n;i++){
            Mark[i]=sc.nextInt();
            sum+=Mark[i];
        }
        System.out.println(sum);


    }
}