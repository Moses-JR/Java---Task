public class TypeCasting {
    public static void main(String[] args) {
        byte n1=32;
        short n2=78;
        char c='A';
        int n4=69;
        long n5=2345;
        float n6=23.45213f;
        double n7=23.9876543;
        //Widening Casting
        short a=n1;
        char b=(char)n2;
        int ch=c;
        long d=n4;
        float e=n5;
        double f=n6;
        System.out.print(a+" "+b+" "+ch+" "+d+" "+e+" "+f+"\n");
        //Narrowing Casting 
        byte z=(byte)(n2);
        short y=(short)(c);
        char x=(char)(n4);
        int w=(int)(n6);
        long v=(long)(n6);
        float u=(float)(n7);
        System.out.print(z+" "+y+" "+x+" "+w+" "+v+" "+u+"\n");
    }
}
