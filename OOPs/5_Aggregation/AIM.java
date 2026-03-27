public class AIM{
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 500);
        Book book2 = new Book("Python Programming", 400);
        Book[] books = {book1, book2};
        l library = new l("City Library", 1990, books);
        library.displayinfo();
    }
}