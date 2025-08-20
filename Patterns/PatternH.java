public class PatternH {
    public static void main(String[] args) {
        int printval=5;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=6-row;col++){
                System.out.print(printval+" ");
            }
            printval--;
            System.out.println();
        }
    }
}
