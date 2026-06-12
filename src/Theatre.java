public class Theatre {
    public static void main(String[] args) {
        Actor clintEastwood = new Actor("Clint", "Eastwood", Gender.MALE, 193);
        Actor merylStreep = new Actor("Meryl", "Streep", Gender.FEMALE, 168);
        Actor alPacino = new Actor("Al", "Pacino", Gender.MALE, 170);

        Director deborahWarner = new Director("Deborah", "Warner", Gender.FEMALE, 30);
        Director matthewBourne = new Director("Matthew", "Bourne", Gender.MALE, 25);

        Person pyotrTchaikovsky = new Person("Pyotr", "Tchaikovsky", Gender.MALE);
        Person choreographer = new Person("Marius", "Petipa", Gender.MALE);

        Show kingLear = new Show("King Lear", 180, deborahWarner);

        Opera eugeneOnegin = new Opera(
                "Eugene Onegin",
                160,
                deborahWarner,
                pyotrTchaikovsky,
                "Based on Alexander Pushkin's verse novel Eugene Onegin.",
                40
        );

        Ballet swanLake = new Ballet(
                "Swan Lake",
                140,
                matthewBourne,
                pyotrTchaikovsky,
                "A reimagining of the classic Swan Lake story with Tchaikovsky's music.",
                choreographer
        );

        kingLear.addActor(alPacino);
        kingLear.addActor(merylStreep);

        eugeneOnegin.addActor(merylStreep);
        eugeneOnegin.addActor(clintEastwood);

        swanLake.addActor(clintEastwood);
        swanLake.addActor(alPacino);

        System.out.println("=== Initial actors lists ===");

        System.out.println(kingLear.getTitle());
        kingLear.printDirector();
        System.out.println("actors:");
        kingLear.printActors();
        System.out.println();

        System.out.println(eugeneOnegin.getTitle());
        eugeneOnegin.printDirector();
        System.out.println("actors:");
        eugeneOnegin.printActors();
        System.out.println();

        System.out.println(swanLake.getTitle());
        swanLake.printDirector();
        System.out.println("actors:");
        swanLake.printActors();
        System.out.println();

        System.out.println("=== Actor replacement ===");

        System.out.println("Replacing Meryl Streep with Clint Eastwood in " +
                kingLear.getTitle() + "...");
        kingLear.replaceActor(clintEastwood, "Streep");

        System.out.println("Updated actors in " + kingLear.getTitle() + ":");
        kingLear.printActors();
        System.out.println();

        System.out.println("Trying to replace a non-existing actor in " +
                eugeneOnegin.getTitle() + "...");
        eugeneOnegin.replaceActor(alPacino, "Pacino");

        System.out.println("Actors in " + eugeneOnegin.getTitle() +
                " after failed replacement attempt:");
        eugeneOnegin.printActors();
        System.out.println();

        System.out.println("=== Libretto texts ===");

        System.out.println("Libretto of " + eugeneOnegin.getTitle() + ":");
        eugeneOnegin.printLibrettoText();
        System.out.println();

        System.out.println("Libretto of " + swanLake.getTitle() + ":");
        swanLake.printLibrettoText();
        System.out.println();
    }
}