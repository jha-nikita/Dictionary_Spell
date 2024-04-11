public class TrieNode {
    public TrieNode[] children;
    public boolean isEndOfWord;
    public String meaning;

    public TrieNode() {
        this.children = new TrieNode[26]; // Assuming only lowercase English letters
        this.isEndOfWord = false;
        this.meaning = null;
    }
}
