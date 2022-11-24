public class cwh11_abstract_animal {
    //QUESTION 3 SHI SE SOLVE HO GYA QUESTION 5 NHI HUA JISKO AMINAL 2 WALE CLASS MEIN SOLVE KR DIYE
    static class monkey {
         void jump() {
            System.out.println("monkey is jumping");

        }

         void bite() {
            System.out.println("it bites as well");
        }
    }

    interface basicanimal {
        void eat(); // interface ka body nhi hota hai {} -- ye nhi lgta

        void sleep(); // interface ka body nhi hota hai {} -- ye nhi lgta
    }

    static class human extends monkey implements basicanimal {
        void speak() {
            System.out.println("hello i am human speaking");
        }

        @Override
        public void eat() {
            System.out.println("basic animal eats");
        }

        @Override
        public void sleep() {
            System.out.println("human sleeps for 8 hours");

        }
    }

    public static void main(String[] args) {
        human aditya = new human();
        aditya.eat();
        aditya.sleep();     // one way allare possible
        aditya.bite();
        aditya.jump();
        aditya.speak();
    }


    //QUESTION 5 JO KI NA JANE KYUN SOLVE NHI HO PAYA


    /*monkey disha = new monkey();
    disha.bite();// monkey k jitne method hai sirf whi use kr skte baanki nhi
    disha.speak();  // ye nhi kr skta kyunki speak sirf humn ka function hai
    basicanimal shreya= new human();
    shreya.sleep();     // basicanimal k jitne method hai sirf whi use kr skte baanki nhi

     */


}

