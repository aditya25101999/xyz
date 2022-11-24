public class cwh_excercise4 {
    static class library{
         int no_of_books=0;
         int i=0;
         String[] books;

        library(){   /* constructor */
            this.books= new String[50];

        }

        void addbooks(String book){
            this.books[no_of_books]=book;
            no_of_books++;
            System.out.println("****** "+book+" added **");

        }
        void issuebooks(String book){
            System.out.println(book+" has been issued ******");
            no_of_books --;
            //jb book issue hoga to book ka count v to ghatega na
            System.out.println("the no. of books in the library is after the issue of "+book +" is " +no_of_books);
            for(i=0;i<books.length;i++){
                if(books[i].equals(book))
                    // yahan pr == v use kr skte the pr suggest kiya aise use krne to kr dye
                    books[i]=null;
            }
        }
        void showavailablebooks(){
            System.out.println("all the available books are ******");
            for (String book:books) {
                if (book==null)    // jb book nhi rehta hai to wahan pr uska naam null store ho rha tha
                    // ie ye nhi kiye the to jo 2 book add kiye uske alawa 48 baar null print hua tha
                    continue;
                System.out.println(book);
            }
        }
        void returnbooks(String book){
            System.out.println(book+" has been returned *****");
            this.books[no_of_books]=book; //add wala copy kr diye kyunki asal mein ho v to whi rha hai
            no_of_books++;


        }

    }

    public static void main(String[] args) {
        library centrallibrary=new library();
        centrallibrary.addbooks("lord of the rings");
        centrallibrary.addbooks("c++");
        centrallibrary.addbooks("python");
        centrallibrary.showavailablebooks();
        centrallibrary.issuebooks("c++");
        centrallibrary.issuebooks("lord of the rings");

        centrallibrary.showavailablebooks();
        centrallibrary.returnbooks("c++");
        centrallibrary.showavailablebooks();

    }
}
