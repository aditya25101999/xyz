public class cwh8_cellphone {

    static class cellphone{

        public  void ringing(){
            System.out.println("the phone is ringing");
        }
        public  void vibrating(){
            System.out.println("the phone is vibrating");
        }
        public  void silent(){
            System.out.println("the phone is on a  silent mode");
        }
    }
    public static void main(String[] args) {
        cellphone realmemasteredition = new cellphone();
        realmemasteredition.silent();
        realmemasteredition.ringing();
        realmemasteredition.vibrating();
    }


}
