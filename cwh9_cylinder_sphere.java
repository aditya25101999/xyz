public class cwh9_cylinder_sphere {
    static class Sphere {
        int radius;

        public float surface_area() {
            return 4 * 3.14f * radius * radius;
        }

        public float volume() {
            return (4 / 3) * 3.14f * radius * radius * radius;
        }
    }
    static class Cylinder{
        int radius;
        int height;
        public float surface_area(){
            return (2*3.14f*radius*height)+(2*3.14f*radius*radius);
        }
        public float volume(){
            return 3.14f*radius*radius*height;
        }
    }
    public static void main(String[] args) {
        Sphere s= new Sphere();


        s.radius=5;
        System.out.println("the surface area of the sphere is "+s.surface_area());
        System.out.println("the volume of the sphere is "+s.volume());
        Cylinder c= new Cylinder();
        c.radius=10;
        c.height=5;

        System.out.println("the volume of the cylinder is "+c.volume());
        System.out.println("the surface area of the cylinder is "+c.surface_area());

    }
}
