public class PatternF {
    public static void main(String[] args) {
        int printval=1;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(printval+" ");
                printval++;
            }
            System.out.println();
        }
    }
}
