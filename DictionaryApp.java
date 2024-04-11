import java.util.ArrayList;
import java.util.List;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.loadDictionary(getWords(), getMeanings());

        UserInterface ui = new UserInterface(dictionary);
        ui.start();
    }

    private static List<String> getWords() {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("pear");
        words.add("grape");
        return words;
    }

    private static List<String> getMeanings() {
        List<String> meanings = new ArrayList<>();
        meanings.add("A fruit that grows on trees and is typically red or green");
        meanings.add("A long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe");
        meanings.add("A round juicy citrus fruit with a tough bright reddish-yellow rind");
        meanings.add("A fruit with a greenish or brownish skin that is typically pear-shaped");
        meanings.add("A small, sweet, seedless green fruit");
        return meanings;
    }
}
