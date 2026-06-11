import java.util.List;

public class Ballet extends MusicalShow {
    private final String choreographer;

    public Ballet(String title, int duration, Director director,
                  List<Actor> listOfActors, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
