public class Book {
    private String title;
    private int pages;
    private int publishyear;
    
    public Book(String name, int pages, int year) {
        this.title = name;
        this.pages = pages;
        this.publishyear = year;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + pages + " pages, " + publishyear;
    }
}