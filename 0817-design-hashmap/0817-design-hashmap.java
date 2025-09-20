class Node {

    public int key;
    public int val;
    public Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {

    private Node[] nodes;

    public MyHashMap() {
        nodes = new Node[1000];
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);
        int index = calculateHash(key);
        if (nodes[index] == null) {
            nodes[index] = newNode;
        } else {
            Node curr = nodes[index];
            Node prev = new Node(-1, -1);
            prev.next = curr;
            while (curr != null) {
                if (curr.key == key) {
                    curr.val = value;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
            // add if key not found
            prev.next = newNode;
        }
    }

    public int get(int key) {
        int index = calculateHash(key);
        Node curr = nodes[index];
        while (curr != null) {
            if (curr.key == key) {
                return curr.val;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = calculateHash(key);
        Node curr = nodes[index];
        if(curr == null){
            return;
        }

         // remove head
    if (curr.key == key) {
        nodes[index] = curr.next;
        return;
    }
    
        Node prev = new Node(-1, -1);
        prev.next = curr;
        boolean nodeFound = false;
        while (curr != null) {
            if (curr.key == key) {
                nodeFound = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        if(!nodeFound){
            return;
        }

        // if (curr.next == null) {
        //     prev.next = null;
        // } else {
        //     prev.next = curr.next.next;
        // }

        prev.next = curr.next;

        //nodes[index] = prev.next;
    }
    

    private int calculateHash(int num) {
        return num % 1000;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */