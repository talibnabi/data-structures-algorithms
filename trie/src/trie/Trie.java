package trie;

import java.util.HashMap;

public class Trie {
    char name;
    String word;
    HashMap<Character, Trie> child;

    public Trie(char name) {
        this.name = name;
        this.word = null;
        child = new HashMap<>();
    }
}
