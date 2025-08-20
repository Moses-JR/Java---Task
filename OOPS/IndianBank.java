interface Bank {
    void deposite();
    static void withdraw(){
        System.out.println("Withdraw");
    }
}
interface  StateBank{
    void deposite1();
    static void withdraw1(){
        System.out.println("Withdraw1");
    }
}
class IndianBank implements Bank,StateBank{
    IndianBank(String name){
        System.out.println(name);
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
        IndianBank obj=new IndianBank("Moses");
    }
}
