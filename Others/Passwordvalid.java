import java.util.*;
public class Passwordvalid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        char[] pass=new char[password.length()];
        for(int i=0;i<password.length();i++){
            pass[i]=password.charAt(i);
        }
        if(password.length()>=8){
            int n=0,s=0,l=0,u=0;
            for(int i=0;i<pass.length;i++){
                if(pass[i]>=48 && pass[i]<=57){
                    n++;
                }else if(pass[i]>=65 && pass[i]<=90){
                    u++;
                }else if(pass[i]>=97 && pass[i]<=122){
                    l++;
                }else{
                    s++;
                }
            }
            if(n!=0 && s!=0 && l!=0 && u!=0){
                System.out.println("Valid Password");
            }
            else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
