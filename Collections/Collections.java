import java.util.*;
public class Collections {
    public static void main(String[] args){
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<10;i++){
        //     list.add(i);
        // }
        // list.remove(2);
        // list.set(4, 8);
        // System.out.println(list.get(0));
        // for(int i:list){
        //     System.out.print(i);
        // }
        
        LinkedHashMap<Integer,Character> key=new LinkedHashMap<>();
        char c='A';
        for(int i=1;i<11;i++){
            key.put(i, c++);
        }
        for(char j:key.values()){
            System.out.println(j);
        }
        for(int k:key.keySet()){
            System.out.println(k);
        }
        for(int l:key.keySet()){
            System.out.println(l+" "+key.get(l));
        }
    }
}
