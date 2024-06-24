class LRUCache {

    class Node{
        int key, value;
        Node prev, next;
    }
    //method to add node in front
    public void addNode(Node node){
        Node neighbour = head.next;

        node.next = neighbour;
        node.prev = head;

        neighbour.prev = node;
        head.next = node;
    }

    //method to remove node from the ending
    public void removeNode(Node node){
        Node prev_neighbour = node.prev;
        Node next_neighbour = node.next;

        prev_neighbour.next = next_neighbour;
        next_neighbour.prev = prev_neighbour;

        node.next = node.prev = null;

    }

    //method to move to front i.e. recently used node
    public void moveToFront(Node node){
        removeNode(node);
        addNode(node);
    }

    HashMap<Integer, Node> cache ;
    int cap;
    Node head, tail;


    public LRUCache(int capacity) {
        cache = new HashMap<>();
        cap = capacity;
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
          Node node = cache.get(key);

          if(node == null) return -1;

          int valueOfNode = node.value;
          moveToFront(node);
          return valueOfNode;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);

        if(node == null){
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;

            if(cache.size() == cap){
                Node LRU_Node = tail.prev;
                cache.remove(LRU_Node.key);
                removeNode(LRU_Node);
            }
            
                cache.put(key,newNode);
                addNode(newNode);
            
            
        }
        else{
            node.value = value;
            moveToFront(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */