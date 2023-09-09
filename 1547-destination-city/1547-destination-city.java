import java.util.Set;
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> start = new HashSet<>();
        for(List<String> list : paths){
            start.add(list.get(0));
        }
        for(List<String> list : paths){
            if(!start.contains(list.get(1))){
                return list.get(1);
            }
        }
    
        return start.iterator().next();
    }
}