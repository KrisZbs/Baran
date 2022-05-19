public class My_First_program {


    public static void main(String[] args) {

        Point p1 = new Point(5,4);
        Point p2 = new Point(10, 6);
        System.out.println("Расстояние между точками:" + p2.distance(p1,p2) );
        System.out.println("Расстояние между точками:" + p1.distance(p1,p2) );
    }
    }
