class RandomizedSet {

    
    Map<Integer, Integer> map;
    List<Integer> list;

   public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        int index = list.size();
        list.add(val);
        map.put(val, index);
        return true;
    }
    
    public boolean remove(int val) {
       if(!map.containsKey(val)){
            return false;
        } 
        int size = list.size();

        // if already last element
        if(list.get(size-1) == val){
            list.remove(size-1);
            map.remove(val);
            return true;
        }
        // swap last index to this
        int index = map.get(val);
        int temp = list.get(size-1);
        list.set(index, temp);
        list.set(size-1, val);
        list.remove(size-1);
        map.remove(val);
        map.put(temp, index);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int size = list.size();
        int index = rand.nextInt(0, size);
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */