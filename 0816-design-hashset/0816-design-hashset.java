class Node {

    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
    }
}

class MyHashSet {

    private Node[] nodes;

    public MyHashSet() {
        nodes = new Node[1000];
    }

    public void add(int key) {
        int index = calculateHash(key);
        Node curr = nodes[index];
        if(curr == null){
            curr = new Node(key);
            nodes[index] = curr;
            return;
        }
        Node prev = new Node(-1);
        prev.next = curr;
        while(curr != null){
            if(curr.key == key){
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = new Node(key);
    }

    public void remove(int key) {
        int index = calculateHash(key);
        Node curr = nodes[index];
        if(curr == null){
            return;
        }
        if(curr.key == key){     
            nodes[index] = curr.next;
            return;
        }
        Node prev = new Node(-1);
        prev.next = curr;
        while(curr != null){
            if(curr.key == key){
               prev.next = curr.next;
               break;
            }
            prev = curr;
            curr = curr.next;
        }
        
    }

    public boolean contains(int key) {
        int index = calculateHash(key);
        Node curr = nodes[index];
        while(curr != null){
            if(curr.key == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    private int calculateHash(int key){
        return key % nodes.length;
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */