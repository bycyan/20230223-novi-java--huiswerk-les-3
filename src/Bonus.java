import java.util.*;
import java.util.Random;

public class Bonus {

    public static Set<Integer> randomNumberGenerator() {

        // een nieuw object voor hashset
        Set<Integer> randomSet = new HashSet<>();
        // een nieuw object voor random
        Random random = new Random();

        // generate 4 unique random numbers
        while (randomSet.size() < 4) {
            // generate a random number between 0 and 9
            int randomNumber = random.nextInt(10);
            randomSet.add(randomNumber);
        }

        // print the contents of the set
        for (int number : randomSet) {
            System.out.println("Random set of ints: "+number);
        }

        return randomSet;
    }

    public static void processHash (StringBuilder sb) {
        sb.append("");
    }

}







//Er is een poort en daarbij een poortwachter als je hierdoorheen wilt dan zegt de poortwachter een getal en jij moet een getal terug zeggen.
//# als jouw antwoord correct is mag je erdoorheen. Paul wilt door de poort de poortwachter zegt acht. paul antwoord met 4 en mag doorlopen.
//# Bas wil ook door de poort de poortwachter zegt twaalf en bas zegt 6.
//# jij wilt er ook doorheen de poortwachter zegt elf. wat moet je antwoorden?
//# jouw antwoord zou moeten zijn 3 want elf bestaat uit 3 letters.