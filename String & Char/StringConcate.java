
public class StringConcate {
    String concate(String str1,String str2){
        String str3="",res="";
        if(str1.charAt(str1.length()-1)==(str2.charAt(0))){
            str3=str1.substring(0,str1.length()-1);
            res=(str3+str2).toLowerCase();
        }else
            res=(str1+str2).toLowerCase();
        return res;
    }
    public static void main(String[] args){
        StringConcate obj=new StringConcate();
        System.out.print(obj.concate("Mark","kete"));
    }
}
