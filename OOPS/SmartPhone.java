interface  device{
    void task();
}
abstract class device1{
    abstract void display();
    device1(){
        this("Hello");
        System.out.println("Default Constructor");
    }
    device1(String s){
        System.out.println(s);
    }
}
class Base extends device1 implements device{
    Base(){
        //super();
        System.out.println("Base");
    }
    public void task(){
        System.out.println("Task method");
    }
    void display(){
        System.out.println("Display Method");
    }
}
public class SmartPhone {
    public static void main(String[] args) {
        Base obj=new Base();
        obj.display();
        obj.task();
    }
}
