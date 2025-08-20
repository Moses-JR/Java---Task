import java.util.*;
public class AlphabetUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int i=0;
        while(a<=b){
                for(int j=0;j<=i;j++){
                    System.out.print(a + " ");
                    if(a==b){
                        a++;
                        break;
                    }
                    a++;
                }
                i++;
                System.out.println();
            
        }

    }
}
