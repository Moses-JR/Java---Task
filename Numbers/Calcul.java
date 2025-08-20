import java.util.*;
public class Calcul {
    static double powerInt(int  num1,int num2){
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
    public static void main(String[] args){
        System.out.println(powerInt(5,2));
        System.out.println(powerDouble(4,3));
    }
}
