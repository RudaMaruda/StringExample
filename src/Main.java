import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Create String, two ways:
        System.out.println("Create String");
        String myText1 = "This is a simple text";
        String myText2 = new String("This is a simple text");

        System.out.println("1. method: String myText1 = This is a simple text  => " + myText1);
        System.out.println("2. method (with operator new): String myText2 = new String(This is a simple text) => " + myText2);
        System.out.println("--------------------------------------");

        /*Immutability, advantages:
        - thread safe
        - security
        - used in HashMap Key
        - heap space
        */

        System.out.println("Immutability");
        String text = "This is ";
        System.out.println("1st version for text: "+text);
        text += "my text";
        System.out.println("2nd version => text += my text = "+text);
        text = "my text";
        System.out.println("New version of text (we replaced: text = my text, we changed reference!), text: "+text);
        System.out.println("--------------------------------------\n");

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
        System.out.println("- use the + operator");
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
        System.out.println("Don't use operator == ! \n");

        System.out.println("4. Length() ");
        System.out.println("Length for textEquals1: textEquals1.length() = "+textEquals1.length()+"\n");

        System.out.println("5. ToUpperCase() / toLowerCase() ");
        String example1 = "tHis Is the eXAmpLe";
        System.out.println("example1: "+example1);
        System.out.println("example1.toUpperCase()= " + example1.toUpperCase());
        System.out.println("example1.toLowerCase()= " + example1.toLowerCase()+"\n");

        System.out.println("6. IndexOf() - return the number of index for search sentence");
        String textValue = "This is the test value";
        System.out.println("textValue: "+textValue);
        System.out.println("textValue.indexOf(This): "+textValue.indexOf("This"));
        System.out.println("textValue.indexOf(is): "+textValue.indexOf("is")+"\n"); // space " " is also considered

        System.out.println("7. ReplaceAll() ");
        System.out.println("textValue: "+textValue);
        System.out.println("textValue.replaceAll(i,YYY): "+textValue.replaceAll("i","YYY")+"\n");

        System.out.println("8. Substring() - cut String with provided index position");
        System.out.println("textValue: "+textValue);
        System.out.println("Only with beginIndex: textValue.substring(3): "+textValue.substring(3));
        System.out.println("With beginIndex: textValue.substring(1,10): "+textValue.substring(1,10));
        System.out.println("With beginIndex and endIndex: textValue.substring(0,10): "+textValue.substring(0,10)+"\n");

        System.out.println("9. Contains() ");
        String exampleText = "Example text";
        System.out.println("exampleText = "+exampleText);
        System.out.println("exampleText.contains(xam): "+exampleText.contains("xam"));
        System.out.println("exampleText.contains(Text): "+exampleText.contains("Text")+"\n");

        System.out.println("10. Trim() - delete space at begin and end of String");
        String textValueWithSpace = "  This is the test value   ";
        System.out.println("textValueWithSpace: "+textValueWithSpace +".");
        System.out.println("textValueWithSpace.trim(): "+textValueWithSpace.trim()+"."+"\n");

        System.out.println("11. IsEmpty()");
        System.out.println("textValueWithSpace: "+textValueWithSpace);
        System.out.println("textValueWithSpace.isEmpty(): "+textValueWithSpace.isEmpty()+"\n");

        System.out.println("12. IsBlank()  - delete space at begin and end of String and check if String is blank");
        String space = "   ";
        System.out.println("String space: "+space+".");
        System.out.println("space.isBlank(): "+space.isBlank()+" ");

    }
}
