 class Car {
        int cc1=1000;
        String color1="Red";
        int cc2=1100;
        String color2="Blue";
    void hundai(){
        System.out.println(cc1 + " "+color1);
     }
     void maruthi(){
        System.out.println(cc2+" "+color2);
     }
}
public class Test {
    public static void main(String[] args) {
        Car obj=new Car();
        
        obj.hundai();
        obj.maruthi();
    }
    
}
