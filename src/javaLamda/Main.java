package javaLamda;

public class Main {
    public static void main(String[] args) {
        // (arguments) -> {statement/s}

        // normal method
        // MyInterface myInterface = new MyInterface() {
        //     public void message(){

        //     }
        // };

        String name = "Bro";
        char symbol = '!';

        //using lamda
        MyInterface myInterface = (x, y) -> {
            System.out.println("Hello World!");
            System.out.println("It's a nice day "+x+y);
        };

        MyInterface myInterface2 = (x, y) -> {
            System.out.println("Hellow " +x+y);
        };

        myInterface.message(name, symbol);
        myInterface2.message(name, symbol);

    }
}
