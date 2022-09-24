package trie;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] wordDB = new String[]{"food", "book", "fool", "full", "word", "fast"};
        Scanner input = new Scanner(System.in);
        Trie root = buildTrie(wordDB);
        while (true) {
            System.out.println("Search: ");
            String searchText = input.nextLine();
            search(root, searchText);
        }
    }

    private static void printTrie(Trie trie) {
        if (trie != null && trie.word != null) {
            System.out.println(trie.word);
        }
        assert trie != null;
        if (trie.child.size() == 0) {
            return;
        }
        for (char c : trie.child.keySet()) {
            printTrie(trie.child.get(c));
        }
    }

    private static void search(Trie root, String searchText) {
        for (int i = 0; i < searchText.length(); i++) {
            char c = searchText.charAt(i);
            if (!root.child.containsKey(c)) {
                return;
            }
            root = root.child.get(c);
        }
        printTrie(root);
    }

    private static Trie buildTrie(String[] wordDB) {
        Trie root = new Trie(' ');
        for (String word : wordDB) {
            Trie currentRoot = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!currentRoot.child.containsKey(c)) {
                    Trie newRoot = new Trie(c);
                    currentRoot.child.put(c, newRoot);
                }
                currentRoot = currentRoot.child.get(c);
            }
            currentRoot.word = word;
        }
        return root;
    }
}
























































