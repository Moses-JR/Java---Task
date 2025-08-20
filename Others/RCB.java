import java.util.Scanner;
public class RCB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary =sc.nextInt();
        byte age=sc.nextByte();
        if(salary>=20000 || age<=25){
            System.out.println("Enter required loan amount");
            int loan=sc.nextInt();
            if(loan<=50000){
                System.out.println("You are eligible for loan");
            }
            else{
                System.out.println("maximum loan amount is 50000");
            }
        }
        else{
            System.out.println("Not eligible for loan");
        }
    }
}
