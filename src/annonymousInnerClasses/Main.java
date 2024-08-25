package annonymousInnerClasses;

public class Main {
    public static void main(String[] args) {
        // Greeting greeting = new Greeting();

        // use annonymous inner class
        Greeting greeting = new Greeting(){
            // override the Welcome function
            @Override
            public void Welcome(){
                System.out.println("Yo yo");
            }
        };

        Greeting greeting2 = new Greeting();

        greeting.Welcome();
        greeting2.Welcome();

    }
}
