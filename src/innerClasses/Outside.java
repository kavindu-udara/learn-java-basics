package innerClasses;

public class Outside {

    String x = "hello ";

    public class Inside{
        String y = "World";

        // create a method
        public void Greeting(){
            System.out.println(x+y);
        }
    }
}
