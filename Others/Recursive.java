public class Recursive {
    // void method(int n){
    //     if(n<0)
    //     return;
    //     System.out.print(n+" ");
    //     method(n-1);
    // }

    
    int fun(int a,int b){
        if(((b&a)>(a-b))&&((2-a)<(a-b))){
            b=3+a+a;
            b=a+2;
            b=2+b+a;
            return fun(a+1, b)+fun(a, b+a);
        }
        b=b+1;
        return a-b;
    }
    

    public static void main(String[] args) {
        Recursive obj=new Recursive();
        // obj.method(10);
        System.out.println(obj.fun(6, 7));
        
    }
}