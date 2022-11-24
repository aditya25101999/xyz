import java.util.*;
import java.lang.Math.*;
public class cwh10_inheritance_circle {
    static class circle{
        int r;

        public circle(int r) {                              //constructor
            this.r = r;
            System.out.println("the radius of circle is "+r);
        }

        circle() {                     // isiliye create kiye taaki ek default constructer ho
        }

        public float area(){
            return (float) (Math.PI*this.r*this.r);
        }

    }
    static class cyclinder extends circle{
        int h;
        public cyclinder(int h){        //constructer 1
            this.r=10;
            this.h=h;

        }

                               //constructer 2
        public cyclinder(int r, int h) {
            super(r);                   // ye ab circle k constructor ko call kr dega
            //this.r=r; // ye likhe ya na likhe r ka value jo user enter kiya hai whi rahega naki super wala
            this.h = h;
            System.out.println("the radius of cyclinder is "+r);

        }

        float volume(){
            return (float) (Math.PI*this.r*this.r*this.h);
        }
    }


    public static void main(String[] args) {
        circle c=new circle(1);
        System.out.println(c.area());

        cyclinder cyc= new cyclinder(10,10);               //constructer 1 will be called
        System.out.println(cyc.volume());

        //cyclinder cyc2= new cyclinder(5,10);  //constructer 2 will be called
        //System.out.println(cyc2.volume());


    }
}
