public class cwh9_constructors {

    static class Cylinder{
         int radius;
         int height;
       // public Cylinder(){
       //   int  radius=599;
       //   int height=170;
      //  }
        public Cylinder(int r, int h){
            radius=r;  // yahan pr int radius likh rhe the isiliye error aa rha tha kyunki
                        // int radius se to ek naya variable define ho jata na so always keep in mind
            this.height=h;   // and yahan sirf radius likhe ya this.radius baat ek hi hai
        }
        public int getRadius(){
            return radius;
        }
        public int getHeight(){
            return height;
        }
    }
    public static void main(String[] args) {
        Cylinder c= new Cylinder(9,6);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
    }
}
