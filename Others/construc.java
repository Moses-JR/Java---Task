public class construc {
    // construc(){
    //     this(5,3);
    // }
    // construc(int a,int b){
    //     int c=this.display(a*b);
    //     System.out.println(c);
    // }
     void display(){

        System.out.println("dis");
    }
   static  void meth2(){
         construc obj=new construc();
        obj.display();
        System.out.println("dd");
    }
    public static void main(String[] args) {
        
        meth2();
    }
}