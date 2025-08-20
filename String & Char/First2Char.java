import java.util.*;
public class First2Char {
    static void print(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(0)+""+str.charAt(1));
        }

    }
    static void ch(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        System.out.print(n%2==0?str.substring(0,n/2):"null");
    }
    static void fl(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(str.substring(1,str.length()-1));
    }
    static void sls(){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()==b.length()){
            System.out.print("Not the same length");
        }else if(a.length()>b.length()){
            System.out.print(b+""+a+""+b);
        }else{
            System.out.print(a+""+b+""+a);           
        }
    }
    static void mixedString(){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int n1=a.length();
        int n2=b.length();
        for(int i=0;i<(n1>=n2?n2:n1);i++){
            System.out.print(a.charAt(i)+""+b.charAt(i));
        }
        System.out.print(n1>n2?a.substring(n2,n1):b.substring(n1,n2));
    }
    public static void main(String[] args){
       // print();
       // ch();
       // fl();
       // sls();
       mixedString();
    }
}
