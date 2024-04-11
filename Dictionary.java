import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private Trie trie;

    public Dictionary() {
        this.trie = new Trie();
    }

    public void loadDictionary(List<String> words, List<String> meanings) {
        if (words.size() != meanings.size()) {
            throw new IllegalArgumentException("Words and meanings lists must have the same size");
        }
        for (int i = 0; i < words.size(); i++) {
            trie.insert(words.get(i), meanings.get(i));
        }
    }

    public List<String> suggestCorrections(String word) {
        // Implement spell check logic here (e.g., using Levenshtein distance)
        // Return a list of suggested corrections
        return new ArrayList<>();
    }

    public String getMeaning(String word) {
        return trie.getMeaning(word);
    }
}
