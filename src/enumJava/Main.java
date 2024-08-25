package enumJava;

// enum
enum Planet{
    // need make all of are UPPERCASE
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO;
}

public class Main {
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

    static void canILiveHere(Planet myPlanet){
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here");
                break;
            default:
            System.out.println("You can't live here..yet");
                break;
        }
    }
}
