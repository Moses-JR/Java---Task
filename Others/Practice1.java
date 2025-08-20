import java.util.*;
public class Practice1 {
    static String[] method(String s){
        if(s.length()%3==0){
            int tp=s.length()/3;
            String[] str=new String[3];
            int fi=0,li=tp;
            for(int i=0;i<3;i++){
                str[i]=s.substring(fi,li);
                fi=li;
                li+=tp;
            }
            return str;
        }else{
                String[] str1=new String[3];
                int tp=s.length()/3;
                int fi=0,li=tp;
                for(int i=0;i<3;i++){
                    if(i==1){
                        li=s.length()-tp;
                        str1[i]=s.substring(fi, li);
                        fi=li;
                        li=s.length();
                    }else{
                        str1[i]=s.substring(fi,li);
                        fi=li;
                        li+=tp;
                    }
                }
            return str1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] word1=method(s1);
        String[] word2=method(s2);
        String password=word2[0]+word1[0]+word1[2]+word2[2];
        System.out.println(password);
    }
}
