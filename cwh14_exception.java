public class cwh14_exception {
     static class exception{
         int a=10;
         int b=8;
         void add(){
             try{
                 int c=a/b;
                 System.out.println(c);
             }
             catch(ArithmeticException e){
                 System.out.println("haha ARITHMETIC EXCCEPTION");
                 System.out.println(e);
             }
             catch (IllegalArgumentException e){
                 System.out.println("hehe");
             }

         }

    }

    public static void main(String[] args) {
         exception e1= new exception();
         e1.add();

    }
}
