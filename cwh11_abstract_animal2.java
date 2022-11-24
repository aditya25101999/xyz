public class cwh11_abstract_animal2 {
    static class monkey{
           void jump(){
            System.out.println("jumping");
        }
    }
    interface animal{
        void sleep();
        void eat();
    }
    public static class human extends monkey implements animal{
        void speak(){
            System.out.println("humans speak");
        }

        @Override
        public void sleep() {
            System.out.println("sleeps 8 hours");
        }

        @Override
        public void eat() {
            System.out.println("eats 3 meals");

        }
    }

    public static void main(String[] args) {

        //POLYMORPHISM KA MAST MAST EXAMPLES
       // EXAMPE1
        monkey m1= new human();
        m1.jump();
       // monkey.speak();  // kyunki speak sirf human ka function hai monkey ka nahi

        //EXAMPLE 2
        animal a1= new human();
        a1.eat();a1.sleep(); // kyunki animal ka method hai eat aur sleep to wo use ho kr skta


       // a1.jump(); // jump monkey ka method hai isiliye animal class ka object nhi use kr skta
       // a1.speak(); // speak human ka method hai isiliye animal class ka object nhi use kr skta

        //EXAMPLE 3
        human h1= new human();
        h1.eat();h1.speak();h1.sleep();h1.jump();
        // sara method use ho skta hai
    }
}
