public class cwh11_abstract_class_pen {
    //QUESTION 1 AND 2
    static abstract class pen{
        abstract void write();  // abstract methhods kyunki kuch v return nhi krte infact unki body ji nhi hoti

        abstract void refil();   // abstract methhods kyunki kuch v return nhi kr rhe
        //infact unki body hi nhi hoti
    }
    static class fountainpen extends pen{
        void changenib(){
            System.out.println("change th enib of the pen");
        }

        @Override
        void refil() {
            System.out.println("need a refil in the pen"); // method ko override kr rhe mtlb ki
            // upaar mein abstract class mein method kuch kr nhi rha tha ab print karega
        }

        @Override  //ye likhe ya na likhe same cheez hai bs better understatnding k liye likha jata h
        void write() {
            System.out.println("aditya kashyap is making this code work ");
        }
    }
    public static void main(String[] args) {
      //  pen pen1=new pen();   //cannot be initiated since an abstract class
        fountainpen pen2=new fountainpen();
       // System.out.println(pen2.changenib());
        pen2.refil();
        pen2.write();
        pen2.changenib();


    }
}
