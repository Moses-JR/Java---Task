import java.util.*;
public class Alphabet {
    public static void main(String[] args){
        //char a=65;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting char : ");
        char b=sc.next().charAt(0);
        System.out.println("Enter the ending char :");
        char c=sc.next().charAt(0);
        if(b<c){
            for(char i=b;i<=c;i++){
                System.out.println(i+" ");
            }
        }
        else{
            for(char i=b;i<91;i++){
            System.out.print(i+" ");
            }
            for(char J=65;J<=c;J++){
            System.out.print(J+" ");
        }
    }   
}   
}

