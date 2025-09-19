class TrieNode {
     public Map<Character, TrieNode> children;
    public boolean isEnd = false;

    public TrieNode(){
        children = new HashMap<>();
        isEnd = false;
    }
}

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                node = new TrieNode();
                curr.children.put(ch, node);
            }

            curr = node;
        }

        curr.isEnd = true; // at the last it needs to be ended
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                return false;
            }
            curr = node;
        }
        return  curr.isEnd == true;
    }

    // Check if a prefix exists in the Trie
    public boolean startsWith(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                return false;
            }
            curr = node;
        }
        return  true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */