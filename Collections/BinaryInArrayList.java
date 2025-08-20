import java.util.*;
public class BinaryInArrayList {

    int Binaryinarraylist(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number of element");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            if(!list.contains(val)){
                list.add(val);
            }
        }

        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    int temp=list.get(i);
                    list.set(list.get(i), list.get(j));
                    list.set(list.get(j), temp);
                }
            }
        }

        System.out.println("Enter target value");
        int tar=sc.nextInt();

        //Linear Search
        Iterator<Integer> it=list.iterator();
        int k=0;
        while(it.hasNext()){
            if(it.next()==tar){
                System.out.print("Value Found");
                return k;
            }else{
                k++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        BinaryInArrayList obj=new BinaryInArrayList();
        System.out.println(obj.Binaryinarraylist());
    }
}
