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
    
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Map<Character, TrieNode> map = curr.children;
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), new TrieNode());
            }
            curr = map.get(word.charAt(i));
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Map<Character, TrieNode> map = curr.children;
            if(!map.containsKey(word.charAt(i))){
                return false;
            }
            curr = map.get(word.charAt(i));
        }
        return curr.isEnd == true;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++){
            Map<Character, TrieNode> map = curr.children;
            if(!map.containsKey(prefix.charAt(i))){
                return false;
            }
            curr = map.get(prefix.charAt(i));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */