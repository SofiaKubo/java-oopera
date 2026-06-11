import java.util.List;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> actors, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
