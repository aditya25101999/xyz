public class cwh10_inheritance_rectangle {
    static class rectangle{
        int l;
        int b;
        int area(){  //method returning area
            return this.l*this.b;
        }
        public rectangle(int l,int b){
            this.l=5;
            this.b=6;
            System.out.println("rectangle is running");
        }
        rectangle(){

        }

    }
    static class cuboid extends rectangle{  //subclass created
        int h;
        public cuboid(int h){  //yahan ka super use kaise karenge samajh nhi aaya
            super();
            this.l=5;
            this.b=6;
            this.h=h;

            System.out.println(" cubiod is running");
        }
        public cuboid(int l,int b, int h){   //constructor with 3 parameters
            super();   //yahan super likhne se upar wala constructor mein jo likha hai wo print hoga
            // pr l aur b la value upar wala nhi hoga wo value whi lega jo cubiod ka object initiation mein diya jaega
            this.l=l;
            this.b=b;
            this.h=h;
        }


        int volume(){
         return    this.l*this.b*this.h;
        }
        int surface_area(){
            return 2*((l*b)+(b*h)+(h*l));
        }
        int perimeter(){
            return 4*(l+b+h);
        }
    }
    public static void main(String[] args) {
        rectangle rectangle= new rectangle(4,6);
       // System.out.println(rectangle.area());
        cuboid cuboid=new cuboid(8);
        System.out.println(cuboid.volume());
        System.out.println(cuboid.surface_area());

    }
}
