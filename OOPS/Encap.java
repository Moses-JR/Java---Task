class Bank {
    private  int accnum;
    private  String accholder;
    private  double balance=5000;
    Bank(int accnum,String accholder){
        this.accholder=accholder;
        this.accnum=accnum;
    }
    void deposit(double balance ){
        if(balance>0)
            this.balance+=balance;
    }
    void withdraw(double balance){
        if(balance<=this.balance && balance>0)
            this.balance-=balance;
    }
    void display(){
        System.out.println(accnum);
        System.out.println(accholder);
        System.out.println(balance);
    }

}
class Encap{
    public static void main(String[] args) {
    Bank b=new Bank(1234,"abc");
    b.deposit(0);
    b.withdraw(0);
    b.display();
    }
}