package questions;

public class BookMain {
    public static void main(String[] args) {
        PhilosophyBook philosophyBook = new PhilosophyBook();
        philosophyBook.bookReader();
        System.out.println(philosophyBook.page(255));
        System.out.println(philosophyBook.getName("Philosophy`s Ethic"));
        philosophyBook.yazar();
    }
}
