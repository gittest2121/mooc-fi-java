
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared) {
        // check references
        if (this == compared) {
            return true;
        }
        
        // check object type
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // cast Object compared into Book Object
        Book comparedBook = (Book) compared;
        
        // check instance variables
        return (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear);
    }

}
