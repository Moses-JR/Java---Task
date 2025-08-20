import java.util.*;
public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
       for(int i=0;i<=6;i++){
        for(int j=0;j<=i;j++){
            System.out.print(a++ + " ");
            if(a==91){
                break;
            }
        }
        System.out.println();
       }
        
    }
}
