interface A{
    void display();
}
 
public class Test1 {
    public static void main(String[] args) {
        A obj=()->{
                System.out.println("Display");
            };
        obj.display();
    }
}
