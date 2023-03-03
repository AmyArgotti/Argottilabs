public class Polyline extends Figure{
    Point2D[] points;
    public Polyline(){}
    public Polyline(Point2D []points){
        this.points= points;
    }
    public Polyline( Point2D p1, Point2D p2, Point2D[]points){
        super(p1, p2);
        this.points= points;
    }
    public double getContour(){
        return 0;
    }
    public void draw( ){
        System.out.println("This ia the draw \\////\\\\//\\///");
    }

}
