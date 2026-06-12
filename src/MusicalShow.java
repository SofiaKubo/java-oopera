public abstract class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;

    protected MusicalShow(String title, int duration, Director director,
                          Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
