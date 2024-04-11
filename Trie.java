public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word, String meaning) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
        current.meaning = meaning;
    }

    public boolean search(String word) {
        TrieNode current = searchNode(word);
        return current != null && current.isEndOfWord;
    }

    public String getMeaning(String word) {
        TrieNode node = searchNode(word);
        return (node != null && node.isEndOfWord) ? node.meaning : "Meaning not found";
    }

    private TrieNode searchNode(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return null;
            }
            current = current.children[index];
        }
        return current;
    }
}
