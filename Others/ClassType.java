class outer{
    class inner{
        void display(){
            System.out.println("Display");
        }
    }
    public static void main(String[] args) {
        outer A=new outer();
        outer.inner obj=A.new inner();
        obj.display();
    }
    
}

