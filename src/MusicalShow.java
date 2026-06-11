import java.util.List;

public class MusicalShow extends Show {
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       List<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
