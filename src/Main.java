import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        boolean play = true;
        String ongeldig = "ongeldige invoer";

        //Arrays
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        //Objects, Imports
        Translator translator = new Translator(numeric, alphabetic);
        Scanner scanner = new Scanner(System.in);


        //User input loop
        while (play) {
            System.out.println("Type 'x' om te stoppen / Type 'v' om te vertalen");
            String input = scanner.nextLine().toLowerCase();

            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                System.out.println("Voer een cijfer in van 0-9");

                int inputGrade = scanner.nextInt();
                scanner.nextLine();

                //Nested
                if (inputGrade < 10) {
                    String result = translator.Translate(inputGrade);
                    //Get Translate from Translator
                    System.out.println(result);
                } else {
                    System.out.println("Voer een cijfer in van 0-9");
                }

            } else {
                System.out.println(ongeldig);
            }

        }
    }
}