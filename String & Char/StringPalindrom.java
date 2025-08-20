import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            str1+=str.charAt(j);
            j--;
        }
        System.out.println(str.equals(str1)?"Palindrom":"Not Palindrom");
        
    }
}