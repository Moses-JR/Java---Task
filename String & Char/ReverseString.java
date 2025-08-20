import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // char[] rev=new char[str.length()];
        // for(int i=0;i<str.length();i++){
        //     rev[i]=str.charAt(i);
        // }
        // for(int j=rev.length-1;j>0;j--){
        //     System.out.print(rev[j]);
        // }
        // StringBuffer sb=new StringBuffer(str);
        // System.out.print(sb.reverse());
        String str1="aeiouAEIOU";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str1.indexOf(str.charAt(i))!=-1){
                c++;
            }
        }
        System.out.println(c);
    }
}
