import java.util.HashMap;

public class Translator {


    HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    //
    public String Translate(Integer number){
        String result = numericAlpha.get(number);
        return result;
    }
}


//Er is een poort en daarbij een poortwachter als je hierdoorheen wilt dan zegt de poortwachter een getal en jij moet een getal terug zeggen.
//# als jouw antwoord correct is mag je erdoorheen. Paul wilt door de poort de poortwachter zegt acht. paul antwoord met 4 en mag doorlopen.
//# Bas wil ook door de poort de poortwachter zegt twaalf en bas zegt 6.
//# jij wilt er ook doorheen de poortwachter zegt elf. wat moet je antwoorden?
//# jouw antwoord zou moeten zijn 3 want elf bestaat uit 3 letters.


