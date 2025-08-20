public class PatternO {
    public static void main(String[] args) {
        for(int row=1;row<=10;row++){
            if(row<=5){
                for(int space=1;space<=row-1;space++){
                System.out.print(" ");
                }
                for(int col=1;col<=6-row;col++){
                System.out.print("*");
                }
                System.out.println();
            }
            else{
                int j=2;
                for(int i=1;i<=row-j;i++){
                    System.out.print(" ");
                }
                for(int star=1;star<=row-5;star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
