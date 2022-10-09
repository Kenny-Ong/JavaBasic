package JavaClass.Class18;

public class Hw2 {
/*Write Book class that will have instance variables and 2 Constructors. While creating an
 object make sure: Instance variables are being initialized
Both Constructors are being executed
 */

}


class Book {
        String name;
        String author;
        int chapter;
        int page;

        public Book (String name, String author, int chapter,int page) {
            this(name, author, chapter);
            this.page =page;
        }
        public Book (String name, String author, int chapter) {
                this.name=name;
                this.author=author;
                this.chapter=chapter;

        }

        public static void main(String[] args) {
                Book physicalTherapy= new Book ("PT for DPT", "John", 21,1120);
                Book kinesiology= new Book ("Intro to Kinesiology", "John", 18);
        }
}