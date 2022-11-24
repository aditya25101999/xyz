public class cwh9_constructor_overloading {
    static class rectangle{
        int len;
         int b;
        public rectangle(int x,int y){ // agar by reference call kiya ja rha hai to that will be given more
            // importance and not the one where we set the values ourselves
            this.len=x;
            this.b=y;
        }
        //#3  ------priority 3 in case of overloading--------
        public rectangle() {
            this.len = 15;
            this.b = 10;
        }
        public rectangle(int x){
            b=20;
            len=x;
        }


        public int getLen() {
            return len;
        }

        public int getB(){
            return b;
        }

        public int area(){
            return len*b;
        }
    }

    public static void main(String[] args) {

        rectangle r= new rectangle(5);
        rectangle r2= new rectangle(5,7);// yahan se nhi bhejenge data to #3rd wala use hoga
        System.out.println(r.area());  //
        System.out.println(r.getB());
        System.out.println(r.getLen());
        System.out.println(r2.area());

    }
}
