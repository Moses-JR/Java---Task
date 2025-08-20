class outer{
    void display1(){
        //obj.display();
        // inner ou=(inner) obj;
        // ou.display();
        this.new inner().display();
        System.out.println("Dispaly1");
    }
    class inner{
        void display(){
        //    A.display1();
       // outer in=(outer) A;
       // in.display1();
            System.out.println("Display");
        }
    }
    public static void main(String[] args) {
        outer A=new outer();
        inner obj=A.new inner();
        // inner obj=new outer().new inner();
        // obj.display(A);
        A.display1();
    }
    
}

