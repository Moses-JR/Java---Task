public class recureson {
    public static void main(String[] args) {
        int result=sum(10);
        System.out.println(result);
        System.out.println(fact(10));
    }
    static int sum(int n){
        if(n>0){
            return n+sum(n-1);
        }else{
            return 0;
        }
    }
    static int fact(int n){
       /*  if(n==0||n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }*/
        //another
        if(n>0){
            return n*fact(n-1);
        }else{
            return 1;
        }
    }
}
