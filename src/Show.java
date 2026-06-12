import java.util.ArrayList;
import java.util.List;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void printDirector() {
        System.out.println("director: " + director);
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Cannot add actor: actor is null.");
            return;
        }

        if (listOfActors.contains(actor)) {
            System.out.println("Cannot add actor: this actor is already in the show.");
            return;
        }

        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        if (newActor == null) {
            System.out.println("Cannot replace actor: new actor is null.");
            return;
        }

        if (surnameToReplace == null || surnameToReplace.isBlank()) {
            System.out.println("Cannot replace actor: surname is empty.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);

            if (currentActor.getSurname().equals(surnameToReplace)) {
                if (listOfActors.contains(newActor) &&
                        !currentActor.equals(newActor)) {
                    System.out.println("Cannot replace actor: new actor is already in the show.");
                    return;
                }

                listOfActors.set(i, newActor);
                return;
            }
        }

        System.out.println(
                "Cannot replace actor: actor with surname " + surnameToReplace +
                        " is not in the show.");
    }
}