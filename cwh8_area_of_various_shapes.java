import java.lang.Math.*;
import java.util.Scanner;

public class cwh8_area_of_various_shapes {
    static class Circle{
        int radius;
        public float perimeter(){
            float p= 2*3.14f*radius;
            return p;
        }
        public float Area(){
            return (float) (3.14f*radius*radius); // either write 3.14 or write float both works
        }
    }
    // ab rectangle k liye class bna rhe
    static class Rectangle{ // public isi;iye nhi likh rhe kyuki ek hi public class ho
        //skta hai pure code and wo already hia main class
        int len; // neeche len aur breadth tb hi daal paenge na jb yahan pr declared ho
        int breadth;
        public int Area(){
            return len*breadth;
        }
        public int perimeter(){
            return 2*(len+breadth);
        }
    }

    ///solving for square/*
    static class Square {
        int side;

        public int Area() {
            return side * side;
        }
        public int perimeter(){
            return 4*side;
        }
    }



    public static void main(String[] args) {
        Circle c= new Circle(); //creating new object od c where cicle is the class
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius of circle");
        c.radius= sc.nextInt();
        System.out.println("the area of the circle is "+c.Area());
        System.out.println("the perimeter of the circle is "+c.perimeter());

        // ab rectangle ka solve kr rhe idhar
        Rectangle r= new Rectangle();
        System.out.println("enter the length of rectangle");
        r.len= sc.nextInt();

        System.out.println("enter the breadth of rectangle");

        r.breadth= sc.nextInt();

        System.out.println(" the area of rectangle is "+r.Area());
        System.out.println(" the perimeter of rectangle is "+r.perimeter());

        //splving for square
        Square s= new Square();
        System.out.println("enter the side of square");
        s.side= sc.nextInt();
        System.out.println("the area of square is "+s.Area());
        System.out.println(" the perimeter of square is "+s.perimeter());


    }
}
