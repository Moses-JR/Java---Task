import java.util.*;
public class StringOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
        }
        int[] arr=new int[128];
        for(int i=0;i<ch.length;i++){
            int count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            arr[ch[i]]=count;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=0){
                System.out.println((char) k+" "+arr[k]);
            }
        }
    }
}
