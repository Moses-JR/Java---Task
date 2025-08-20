import java.util.*;
public class Generics {
    public static <T> void display(T input){
        System.out.print(input);
    }
    public static void display(List<?> element){
        System.out.println(element.get(0));
    }
    public static void main(String[] args){
        Generics obj=new Generics();
        display("SDF");
        List<Integer> list=new ArrayList<>();
        list.add(45);
        List<String> list1=new ArrayList<>();
        list1.add("Moses");
        display(list);
        display(list1);
        printer obj1=new printer("Hello");

    }
}
class printer <T>{
    printer(T input){
        this.methode(input);
    }
    void methode(T input){
        System.out.println(input);
    }
}