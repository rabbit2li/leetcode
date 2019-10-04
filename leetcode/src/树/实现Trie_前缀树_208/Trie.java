package 树.实现Trie_前缀树_208;

import java.util.TreeMap;

public class Trie {

    private class Node {
        private boolean isWord;
        private TreeMap<Character, Node> next;

        Node() {
            this(false);
        }

        Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }
    }

    private Node root; // 根节点
    private int size; // 单词数量

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new Node();
        size = 0;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }
        if (!cur.isWord) {
            cur.isWord = true;
            size++;
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null) {
                return false;
            }
            cur = cur.next.get(c);
        }
        return cur.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (cur.next.get(c) == null) {
                return false;
            }
            cur = cur.next.get(c);
        }
        return true;
    }
}
