import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        List<Integer> playlist1=new ArrayList<>();
        for (int i=0;i<n1;i++) {
            playlist1.add(sc.nextInt());
        }
        int n2=sc.nextInt();
       List<Integer> List = new ArrayList<>();
        for (int i=0;i<n2;i++) {
            int track=sc.nextInt();
            if (playlist1.contains(track)) {
                List.add(track);
            }
        }
        if (List.isEmpty()) {
            System.out.println("None");
            System.out.println(0);
        } else {
            Collections.sort(List);
            for (int id:List) {
                System.out.print(id + " ");
            }
            System.out.println();
            System.out.println(List.size());
        }
    }
}
