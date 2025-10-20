class Spreadsheet {

     Map<Character, int[]> map;
    int rows;

    public Spreadsheet(int rows) {
        map = new HashMap<>();
        this.rows = rows + 1;
    }
    
    public void setCell(String cell, int value) {
        char col = cell.charAt(0);
        int[] cellRows;
        if(!map.containsKey(col)){
            cellRows = new int[rows];
        } else {
            cellRows = map.get(col);
           
        }
        cellRows[Integer.valueOf(cell.substring(1))] = value;
        map.put(col, cellRows);
    }
    
    public void resetCell(String cell) {
        char col = cell.charAt(0);
        int[] cellRows;
        if(!map.containsKey(col)){
            cellRows = new int[rows];
        } else {
            cellRows = map.get(col);
           
        }
        cellRows[Integer.valueOf(cell.substring(1)) ] = 0;
        map.put(col, cellRows);
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] strs = formula.split("\\+");
        int val1 = 0;
        int val2 = 0;
            
        if(Character.isLetter(strs[0].charAt(0))){
            if(map.get(strs[0].charAt(0)) == null){
                val1 = 0;
            }else{
                int[] cellRows = map.get(strs[0].charAt(0));
                val1 = cellRows[Integer.valueOf(strs[0].substring(1))];
            }
        } else {
            val1 = Integer.valueOf(strs[0]);
        }

        if(Character.isLetter(strs[1].charAt(0))){
            if(map.get(strs[1].charAt(0)) == null){
                val2 = 0;
            }else{
                int[] cellRows = map.get(strs[1].charAt(0));
                val2 = cellRows[Integer.valueOf(strs[1].substring(1))];
            }
        } else {
            val2 = Integer.valueOf(strs[1]);
        }

        return val1 + val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */