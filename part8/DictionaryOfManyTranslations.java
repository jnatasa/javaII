
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {

        ArrayList<String> wordTranslations = translations.getOrDefault(word, new ArrayList<>());

        wordTranslations.add(translation);

        translations.put(word, wordTranslations);
    }

    public ArrayList<String> translate(String word) {
        return translations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        translations.remove(word);
    }
}