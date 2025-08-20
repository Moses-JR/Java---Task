class Box {
    int width,height,depth;
    Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    void volume(){
        System.out.println(width*height*depth);
    }
}
public class BoxMain{
    public static void main(String[] args) {
        Box b=new Box(5, 4, 3);
        b.volume();
    }
}
