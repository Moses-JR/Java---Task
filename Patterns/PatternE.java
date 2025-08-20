public class PatternE {
    public static void main(String[] args) {
        int printval=1;
        for(int row=1;row<=5;row++){
            printval=row%2==0?0:1;
            for(int col=1;col<=row;col++){
                System.out.print(printval+" ");
                printval=printval==0?1:0;
            }
            System.out.println();
        }
    }
}
