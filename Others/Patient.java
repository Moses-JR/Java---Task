public class Patient {
    String name;
    double height,weight;
    Patient(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    double computeBMI(){
        double result=weight/(height*height);
        return result;
}
}
class Java{
    public static void main(String[] args){
        Patient p=new Patient("Moses",4.0,55.0);
        System.out.println(p.computeBMI());
    }
}