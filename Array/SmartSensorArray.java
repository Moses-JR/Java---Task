import java.util.*;
public class SmartSensorArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0 && n>100){
            System.out.println("Invalid Input");
        }
        else{
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int mod=sc.nextInt();
            {
                //Get Prime Numbers
                int[] temparr=new int[n];
                int k=0,sum=0,l=2;
                int[] temparr1=new int[n];
                temparr1[0]=0;
                temparr1[1]=1;
                for(int i=2;i<=n;i++){
                    int c=0;
                    for(int j=2;j<=i/2;j++){
                        if(i%j==0){
                            c++;
                            break;
                        }
                    }
                    if(c==0){
                        temparr[k]=i;
                        k++;
                    }else{
                        temparr1[l]=i;
                        l++;
                    }
                }
                if(mod==1){
                    for(int val:temparr){
                        if(val==0){
                            continue;
                        }  
                        sum+=arr[val];
                    }
                    System.out.println(sum);
                }else if(mod==2){
                    for(int val:temparr1){  
                        sum+=arr[val];
                    }
                    System.out.println(sum);
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}
