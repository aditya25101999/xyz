public class cwh11_interface_phone {
    // WUESTION 4
    static abstract class telephone {
        abstract void ring();

        abstract void lift();

        abstract void disconnect();
    }
    static class smartphone extends telephone{
        void playmusic(){
            System.out.println("only smartphone is playing music");
        }

        @Override
        void ring() {
            System.out.println("ringing");
        }

        @Override
        void lift() {
            System.out.println("picked ip the call");
        }

        @Override
        void disconnect() {
            System.out.println("disconnected");

        }
    }


    public static void main(String[] args) {
        smartphone nokia= new smartphone();
        nokia.disconnect();
        nokia.lift();           //sara chalega
        nokia.ring();
        nokia.playmusic();


        System.out.println("ab case two chal rha hai ");

        telephone samsung= new smartphone();
        samsung.disconnect();
        samsung.lift();
        samsung.ring();

        /// thorws an error
       // samsung.playmusic();  // ye nhi us ekr pa rha kyunki ye sirf smartphone ka feature hai
                                // naki ek telephone ka jisko hmlog smartphone bol rhe hai
    }
}
