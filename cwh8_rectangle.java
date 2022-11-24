public class cwh8_rectangle {

    static class Rectangle{ // public isi;iye nhi likh rhe kyuki ek hi public class ho
        //skta hai pure code and wo already hia main class
        int len; // neeche len aur breadth tb hi daal paenge na jb yahan pr declared ho
        int breadth;
        public  int Area(){
            return len*breadth;
        }
    }
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.len=10;
        r.breadth=5;
        System.out.println(r.Area());

    }
}
