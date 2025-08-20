import java.util.*;
public class name {
    public static void main(String[] args){
       ArrayList<String> list=new ArrayList<String>();
       Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(sc.nextLine());
        }
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.print(list);

        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<5;i++){
            int val=sc.nextInt();
            if(!li.contains(val)){
                li.add(val);
            }
        }
        System.out.print(li);
        

    }
}
