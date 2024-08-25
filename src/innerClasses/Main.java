package innerClasses;

public class Main {
    public static void main(String[] args) {
        // inner classes - classes inside other classes

        Outside out = new Outside();

        // access inner class
        Outside.Inside in = out.new Inside();
        // System.out.println(out.x+in.y);

        // call inside class method
        in.Greeting();

    }
}
