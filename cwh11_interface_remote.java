public class cwh11_interface_remote {
    // QUESTION 6
    interface tv_remote{
        void switchON();
        void changeChannel(); //interface mein sara methods abstract hota hai ie no body
    }
    interface smartRemote extends tv_remote{
        void voicesearch();
        void youtube();
    }
    static class tv implements smartRemote{

        @Override
        public void switchON() {
            System.out.println("swithing on");
        }

        @Override
        public void changeChannel() {
            System.out.println("changing the chaneel");

        }

        @Override
        public void voicesearch() {
            System.out.println("can search chanel by voice seach");

        }

        @Override
        public void youtube() {
            System.out.println("can play youtube as well");

        }
    }

    public static void main(String[] args) {
       /* smartRemote m1= new smartRemote() {  // jaise hi smartRemote ka object banaye sara methods
                                                // apne aap override krne aa gya tv ka v aur smart tv ka v
                                                //ie inherit ho gya methods
            @Override
            public void voicesearch() {

            }

            @Override
            public void youtube() {

            }

            @Override
            public void switchON() {

            }

            @Override
            public void changeChannel() {

            }
        } {
            @Override
            public void switchON() {

            }

            @Override
            public void changeChannel() {

            }
        }

        */

        tv onida =new tv();
        onida.changeChannel();onida.switchON();onida.voicesearch();onida.youtube();
    }
}
