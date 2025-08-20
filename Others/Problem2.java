import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Sensor Error: Water level reading invalid!");
        }else if(n>=0 && n<=69){
            System.out.println("Engine cold.Allow engine  to warm up");
        }else if(n>=70 && n<=100){
             System.out.println("Engine temp narmal");
        }else if(n>=101 && n<=120){
            System.out.println("Warning: Engine heating up.");
        }else if(n>=121 && n<=150){
            System.out.println("Critical : Engine over heating");
        }else if(n>150 && n<=200){
            System.out.println("System Alert : Potential engine fire risk");
        }else if(n>200){
            System.out.println("Invalid input");
        }
    }
}
