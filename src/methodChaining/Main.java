package methodChaining;

public class Main {
    public static void main(String[] args) {
        String name = "kavindu";

        // // concatinating
        // name = name.concat(" udara");
        // // uppercase
        // name = name.toUpperCase();
        // // remove any blank spaces
        // name = name.trim();

        // method chaining
        name = name.concat(" udara").toUpperCase().trim();

        System.out.println(name);
    }
}
