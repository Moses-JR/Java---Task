import java.util.*;

public class RemoveDup {
    public static void main(String[] args){
        int arr[]={3,5,2,77,7,3,7,99,1,2};
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.print(list);
        String k="Apple";
        System.out.print(k.hashCode());
    }
}
