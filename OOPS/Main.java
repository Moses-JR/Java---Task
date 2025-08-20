class inherit {
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends inherit{
    void eat(){
        System.out.println("Barking");
    }
}
public class Main{
    public static void main(String[] args){
        inherit i=new inherit();
        dog d=new dog();
        inherit d1=new dog();
        i.eat();
        d.eat();
        d1.eat();
    }
}
