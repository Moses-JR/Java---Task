import java.util.*;
public class EqualizingEnergyLevel {
    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int[] arr=new int[3];
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
            }
            if(arr[0]==arr[1] && arr[1]==arr[2]){
                System.out.println("0");
            }
            if((arr[0]+arr[1]+arr[2]%3!=0)){
                System.out.println("-1");
            }
            
        }
    }
}
