package genericClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // MyIntegerClass myInt = new MyIntegerClass(1);
        // MyDoubleClass myDouble = new MyDoubleClass(1.0);
        // MyCharacterClass myChar = new MyCharacterClass('@');
        // MyStringClass myString = new MyStringClass("Hello");

        // System.out.println(myInt.getValue());
        // System.out.println(myDouble.getValue());
        // System.out.println(myChar.getValue());
        // System.out.println(myString.getValue());

        // do same with MyGenericClass
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<Integer, Integer>(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<Double, Double>(1.0, 1.01);
        MyGenericClass<Character, Character> myChar = new MyGenericClass<Character, Character>('@', '$');
        MyGenericClass<String, Character> myString = new MyGenericClass<String, Character>("Hello", '!');

        ArrayList<String> myFriend = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
