class Solution {
     public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(stack.isEmpty() && map.containsKey(ch)){
                return false;
            }else if(!map.containsKey(ch)){
                stack.push(ch);
            }else if(!stack.peek().equals(map.get(ch))){
                return false;
            }else if(stack.peek().equals(map.get(ch))){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}