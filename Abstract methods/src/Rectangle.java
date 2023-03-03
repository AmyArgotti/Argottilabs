public class Rectangle extends Figure implements Areaable{
    public Rectangle (Point2D p1, Point2D p2){
        super (p1,p2);
    }
    public Rectangle(){
    }

    @Override
    public double getArea(){
        return getHeight()* getWidth();
    }

    @Override
    public double getContour() {
        return 2.0 * getHeight()* getWidth();
    }

    @Override
    public void draw(){
        System.out.println("This is a rectangle ");
    }
}
