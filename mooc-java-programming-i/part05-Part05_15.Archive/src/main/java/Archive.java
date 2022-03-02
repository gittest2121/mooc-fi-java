public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compared) {
        // check references
        if (this == compared) {
            return true;
        }
        
        // check object type
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        // cast object compared to object type Archive
        Archive comparedArchive = (Archive) compared;
        
        // check instance variables
        // check identifier since there can be variation
        // in their names in different countries
        return (this.identifier.equals(comparedArchive.identifier));
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}