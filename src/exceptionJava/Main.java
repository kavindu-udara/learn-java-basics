package exceptionJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        // check age
        try {
            checkAge(age);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Age problem accoured: " + e);
        }
    }

    static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("\n" + "You must be 18+ to sign up");
        }else{
            System.out.println("You are now signed up");
        }
    }
}
