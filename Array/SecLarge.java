import java.util.Arrays;
public class SecLarge {
    public static void main(String[] args){
        int[] la={23,34,45,345,78};
        //largest value
       /*  int sl=0;
        for(int i=0;i<la.length-1;i++){
            if(sl<la[i]){
                sl=la[i];
            }
        }
        System.out.println(sl);*/
        //second largest value using sort
        /*Arrays.sort(la);
        if(la[la.length-1]!=la[la.length-2]){
            System.out.println(la[la.length-2]);
        }else{
            System.out.println(la[la.length-3]);
        }*/
        /* 
        Arrays.sort(la);
        int n=la.length;
        for(int i=n-1;i<n && i>=0;i--){
            if(la[i]!=la[i-1]){
                System.out.println(la[i-1]);
                break;
            }
        }
    */
           for(int i=0;i<la.length-1;i++){
            for(int j=i+1;j<la.length;j++){
                if(la[i]>la[j]){
                    int l=la[i];
                    la[i]=la[j];
                    la[j]=l;
                }
            }
    }
            //System.out.println(la[la.length-2]);
            //System.out.println(la[la.length-1]);
            for(int i:la)
                System.out.println(i);
    
    }
}
