import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht

        ArrayList<Integer> numeric = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        ArrayList<String> alphabetic = new ArrayList<>(List.of("een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"));

    }
}


//        boolean b = set.add(105);
//        if (set.add(101)) {
//            System.out.println("101 toegevoegd");
//        }
//        else {
//            System.out.println("101 niet toegevoegd");
//        }
//        System.out.println(set);

        /* deze regel mag je weg halen voor de bonus opdracht. Onderstaande code is voor de bonus opdracht.
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();
         deze regel mag je weg halen voor de bonus opdracht */

    /*
     Deze methode is voor de bonus opdracht.
     */
//    public static void feedback(String stringnumber) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder feedback = new StringBuilder();
//        System.out.println("take a guess");
//        String guess = scanner.nextLine();
//        if (Objects.equals(guess, stringnumber)) {
//            System.out.println("gefeliciteerd je hebt het goed");
//        } else {
//            for (int i = 0; i < 4; i++) {
//                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
//                    feedback.append("+");
//                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
//                    feedback.append("0");
//                } else {
//                    feedback.append("X");
//                }
//            }
//        }
//        System.out.println(feedback.toString());
//    }
//}
