import java.util.Scanner;

interface Bank {
    void deposite();
    static void withdraw(){
        System.out.println("Withdraw");
    }
}
interface  StateBank{
    void deposite1();
    static void withdraw1(){
        Bank.withdraw();
        System.out.println("Withdraw1");
    }
}
class IndianBank implements Bank,StateBank{
    IndianBank(String nam,int idnum){
        System.out.println(nam+" "+idnum);
    }
   public void deposite(){
        System.out.println("Deposite");
    }
    public void deposite1(){
        System.out.println("Deposite1");
    }
}

public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        IndianBank obj=new IndianBank(name,id);
        obj.deposite();
        obj.deposite1();
        StateBank.withdraw1();
    }
}
