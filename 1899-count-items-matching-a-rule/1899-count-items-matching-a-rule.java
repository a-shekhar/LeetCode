class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1; 
        int count = 0;
        switch(ruleKey){
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

       
        for(List<String>item : items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}