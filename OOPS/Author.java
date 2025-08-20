public class Author {
    private String name,email;
    private char gender;
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}
class Book{
    private String bname;
    private double price;
    private int qtyStock;
    Book(String bname,double price,int qtyStock){
        this.bname=bname;
        this.price=price;
        this.qtyStock=qtyStock;
    }
    void setter(){

    }
    void getter(){

    }
    public static void main(String[] args) {
        Author a=new Author("Moses", "moses@gmail.com", 'M');
        
    }
}