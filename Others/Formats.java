public class Formats {
    public static void main(String[] args) {
        String name="Moses";
        int age=19;
        double mark=98.8754323442;
        char grade='A';
        boolean stud=true;
        System.out.printf("Name     : %-10s%n",name);
        System.out.printf("Age      : %04d%n",age);
        System.out.printf("Mark     : %.4f%n",mark);
        System.out.printf("Grade    : %1c%n",grade);
        System.out.printf("Stud     : %b%n",stud);
        System.out.printf("Stud     : %B%n",stud);
    }
}
