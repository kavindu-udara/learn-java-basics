package enumJava;

enum Planet {
    // need make all of are UPPERCASE
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    Planet(int number) {
        this.number = number;
    }

}

public class LevelTwo {
    public static void main(String[] args) {
        // enum = enumerated
        // enum are const
        // enum are grouping of constants
        // behave similary to objects

        // select enum
        Planet myPlanet = Planet.EARTH;

        // call the function
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here");
                System.out.println("This is Planet #" + myPlanet.number);
                break;
            default:
                System.out.println("You can't live here..yet");
                System.out.println("This is Planet #" + myPlanet.number);
                break;
        }
    }
}
