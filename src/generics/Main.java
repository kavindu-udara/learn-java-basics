package generics;

public class Main {
    public static void main(String[] args) {
        
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String[] stringArray = { "hello", "world" };

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }

    // public static void displayArray(Integer[] array) {
    //     for (Integer x : array) {
    //         System.out.print(x + " ");
    //     }
    //     System.out.println();
    // }

    // public static void displayArray(Double[] array) {
    //     for (Double x : array) {
    //         System.out.println(x + " ");
    //     }
    //     System.out.println();
    // }

    // public static void displayArray(Character[] array) {
    //     for (Character x : array) {
    //         System.out.println(x + " ");
    //     }
    //     System.out.println();
    // }

    // public static void displayArray(String[] array) {
    //     for (String x : array) {
    //         System.out.println(x + " ");
    //     }
    //     System.out.println();
    // }

    // generic method
    public static <Thing> void displayArray(Thing[] array){
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }

}
