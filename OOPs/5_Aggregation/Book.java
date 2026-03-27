public class Book {
    String title;
    int pages;
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayinfo(){
        return this.title + " (" + this.pages + " )pages";
    }
}
