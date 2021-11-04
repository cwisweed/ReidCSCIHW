package HW1;

import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Start of Main");
        Pyramid.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs MyStory = new Adlibs();
        System.out.println("Hello, What is your name?");
        String name = keyboard.nextLine();
        System.out.println("and your age?");
        String age = keyboard.nextLine();
        System.out.println("and lastly, your favorite color?");
        String color = keyboard.nextLine();
        System.out.println(MyStory.story(name, age, color));
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        
        String m = "I MAKE BREAD";
        Replace Stringfortesting = new Replace();
        System.out.println(Stringfortesting.charReplace(m ,2, 'T'));
        


        


        

    }
}
