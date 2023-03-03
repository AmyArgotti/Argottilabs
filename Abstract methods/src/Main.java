
    public class Main {
        public static void main(String[] args) {
            Line line = new Line(new Point2D(1, 5), new Point2D(5, 2));
            line.printAll();
            System.out.println();

            Rectangle rectangle = new Rectangle(new Point2D(1, 5), new Point2D(5, 2));
            rectangle.printAll();
            System.out.println("Area = " + rectangle.getArea());
            System.out.println("**********************************************************************************************");
//        Figure[] figures = new Figure[7];
//        figures[0] = line;
//        figures[1] = rectangle;
//        figures[2] = new Rectangle(new Point2D(2, 7), new Point2D(4, 3));
//        figures[3] = new Rectangle(new Point2D(2, 17), new Point2D(4, 5));
//        figures[4] =  new Line(new Point2D(2, 6), new Point2D(5, 2));
//        figures[5] =  new Line(new Point2D(2, 6), new Point2D(5, 1));
//        figures[6] =  new Rectangle(new Point2D(2, 9), new Point2D(4, 1));

            Figure[] figures = {
                    line,
                    rectangle,
                    new Rectangle(new Point2D(2, 7), new Point2D(4, 3)),
                    new Rectangle(new Point2D(2, 17), new Point2D(4, 5)),
                    new Line(new Point2D(2, 6), new Point2D(5, 2)),
                    new Line(new Point2D(2, 6), new Point2D(5, 1)),
                    new Rectangle(new Point2D(2, 9), new Point2D(4, 1))
            };
//
            for(var f : figures) {
                f.printAll();
                System.out.println();
            }

            double sumLineRectangle = sumContour(line, rectangle);
            System.out.println("line + rectangle = " + sumLineRectangle);
            System.out.println();

            System.out.println("sumContour for figures = " + sumContour(figures));

            ((Figure)getMaxAreaable(rectangle, new Rectangle(new Point2D(2, 23), new Point2D(4,2)))).printAll();
            System.out.println();

            System.out.println("Площадь наибольшей фигуры = " +
                    getMaxAreaable(rectangle, new Rectangle(new Point2D(2, 23), new Point2D(4,2))).getArea());


            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

            Figure m = rectangle;
            for(var f : figures) {
                if (f instanceof Areaable) {
                    m = (Figure) getMaxAreaable((Areaable) m, (Areaable) f);
                }
            }
            m.printAll();
            System.out.println(((Areaable)m).getArea());

        }

        public static Areaable getMaxAreaable(Areaable... fff){
            Areaable max = fff[0];
            for (int i = 1; i < fff.length ; i++) {
                if (fff[i].getArea() > max.getArea()) {
                    max = fff[i];
                }
            }
            return max;
        }


        public static double sumContour(Figure ... fff) {
            double sum = 0;
            for(var f : fff) {
                sum += f.getContour();
            }

//        for (int i = 0; i < fff.length; i++) {
//            sum += fff[i].getContour();
//        }
            return sum;
        }
    }