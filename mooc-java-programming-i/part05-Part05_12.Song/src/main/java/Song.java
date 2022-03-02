
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    @Override
    public boolean equals(Object compared) {
        // compare if addresses are equal
        if (this == compared) {
            return true;
        }
        
        // compare if types are same
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // convert the object into a Song object
        Song comparedSong = (Song) compared;
        
        // compare if instance variables are equal
        if (this.name.equals(comparedSong.name) &&
                this.artist.equals(comparedSong.artist) &&
                this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        
        // else
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
