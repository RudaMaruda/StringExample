import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Create String, two ways:
        System.out.println("Create String");
        String myText1 = "This is a simple text";
        String myText2 = new String("This is a simple text");

        System.out.println("myText1: " + myText1);
        System.out.println("myText2: " + myText2);
        System.out.println("--------------------------------------");

        /*Immutability, advantages:
        - thread safe
        - security
        - used in HashMap Key
        - heap space
        */

        System.out.println("Immutability");
        String text = "This is ";
        System.out.println("text 1st version: "+text);
        text += "my text";
        System.out.println("text 2nd version (we added text): "+text);
        text = "my text";
        System.out.println("text New version (we replace text, we changed reference): "+text);
        System.out.println("--------------------------------------");

        System.out.println("Methods in String class: \n");

        System.out.println("1. Intern: (take a string from string pool) ");
        String text1 = "This is a test";
        String text2 = "This is a test";
        String val1 = text1.intern();  // we take a value from text1: This is a test
        String val2 = text2.intern();  // we take a value from text2: This is a test
        System.out.println("String val1 = text1.intern(), String val2 = text2.intern() ");
        System.out.println("val1.equals(val2) This text is the same? "+ val1.equals(val2)+"\n");

        System.out.println("2. Concat (two ways to concatenating Strings)");
        String first = "Hello my name is ";
        System.out.print("first String : " + first);
        String second = "Margaret Krawczyk.";
        System.out.println(", second String: " + second);
        System.out.println("- use the "+" operator");
        String finalText = first + second;
        System.out.println("finalText = first + second = " + finalText);
        System.out.println("- use concat() method");
        String finalTextConcat = first.concat(second);
        System.out.println("finalTextConcat = first.concat(second) = " + finalTextConcat+"\n");

        System.out.println("3. Equals() ");
        String textEquals1 = "Text to compare";
        String textEquals2 = "Text to compare";
        System.out.println("textEquals2: "+textEquals1+" ,textEquals2: "+textEquals2);
        System.out.println("textEquals1.equals(textEquals2): "+textEquals1.equals(textEquals2));
        System.out.println("Dont use operator == ! \n");

        System.out.println("4. Length() ");
        System.out.println("Length for textEquals1: textEquals1.length() = "+textEquals1.length()+"\n");

        System.out.println("5. ToUpperCase() / toLowerCase() ");
        String example1 = "tHis Is the eXAmpLe";
        System.out.println("example1: "+example1);
        System.out.println("example1.toUpperCase()= " + example1.toUpperCase());
        System.out.println("example1.toLowerCase()= " + example1.toLowerCase());


    }
}
