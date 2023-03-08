import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

         /*
     Deze methode is voor de bonus opdracht.
     */
//        public static void feedback(String stringnumber) {
//            //Objects, Imports
//            Translator translator = new Translator(numeric, alphabetic);
//            Scanner scanner = new Scanner(System.in);
//            StringBuilder feedback = new StringBuilder();
//            System.out.println("take a guess");
//            String guess = scanner.nextLine();
//            if (Objects.equals(guess, stringnumber)) {
//                System.out.println("gefeliciteerd je hebt het goed");
//            } else {
//                for (int i = 0; i < 4; i++) {
//                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
//                        feedback.append("+");
//                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
//                        feedback.append("0");


            Set<Integer> randomSet = Bonus.randomNumberGenerator();
            StringBuilder sb = new StringBuilder();
            for (int number : randomSet) {
                sb.append(number);
            }
            Bonus.processHash(sb);
            System.out.println("Random ints to string: "+ sb.toString()); // prints the processed string

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
//                if (inputGrade != sb.compareTo(sb))
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