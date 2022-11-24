public class cwh9_getters_setters {

    static class Cylinder{
        int radius;
        int height;
        public void setRadius(int r){
            radius=r;
        }
        public int getRadius(){
            return radius;
        }
        public void setHeight(int h){
            height=h;
        }
        public int getHeight(){
            return height;
        }

    }
    static class Sphere{
        int radius;
        public void setRadius(int r){
           radius=r;
        }
        public int getRadius(){
            return radius;

        }
    }
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        Sphere s= new Sphere();

        c.setHeight(5);
        c.setRadius(10);
        s.setRadius(15);
        System.out.println("the height of the cylinder is "+c.getHeight());
        System.out.println("the height of the cylinder is "+c.getRadius());

        System.out.println("the radius of the sphere is "+s.getRadius());


    }
}
