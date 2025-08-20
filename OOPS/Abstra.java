abstract class Abs {
    abstract void display();
}
class Base extends Abs{
    @Override
    void display() {
        System.out.println("Display Run");
    }
}
public class Abstra{
    public static void main(String[] args) {
        Abs obj=new Base();
        obj.display();
    }
}