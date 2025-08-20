public class PatternJ {
    public static void main(String[] args) {
        for(int row=1;row<=9;row++){
            int coltim=row>5?(10-row):row;
            for(int col=1;col<=coltim;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
