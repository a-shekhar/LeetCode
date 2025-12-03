class Solution {
    public List<String> removeSubfolders(String[] folder) {
         List<String> list = new ArrayList<>();
        Arrays.sort(folder);
        list.add(folder[0]);
        int i = 0;
        int j = 1;
        while(j < folder.length){
             if(folder[j].startsWith(folder[i] + "/")){
                j++;
             } else {
                list.add(folder[j]);
                i = j;
                j++;
             }
        }
        return list;
    }
}