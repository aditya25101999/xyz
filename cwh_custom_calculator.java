public class cwh_custom_calculator {
    static class calendar{
        int a;
        int b;
        public int addition(int a, int b){
            int sum = 0;
            try {
                this.a=a;
                this.b=b;

                 sum=a+b;
            }
            catch (Exception e){
                System.out.println(e);

            }
            return (sum);

        }
        public int substraction(int x, int y){
            int minus = 0;
            try {
                this.a=x;
                this.b=y;

                minus=a-b;
            }
            catch (Exception e){
                System.out.println(e);

            }
            return (minus);

        }
        public int multiplication(int x, int y){
            int product = 0;

                try {
                    if (x>7000 && y>7000) {

                        this.a = x;
                        this.b = y;

                        product = a * b;
                    }

                }
                catch (Exception e) {
                    System.out.println(e);

                    return (product);
                }
            }
        }





        }



    public static void main(String[] args) {
        calendar c= new calendar();
        System.out.println(c.addition(3,4));
        System.out.println(c.substraction(45,87));
        System.out.println(c.multiplication(45,87));


    }
}
