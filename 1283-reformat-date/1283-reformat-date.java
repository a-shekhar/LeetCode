class Solution {
    public String reformatDate(String date) {
        String[] format = date.split(" ");
        String[] months = new String[]{ "Jan", "Feb", "Mar", "Apr",
        "May", "Jun", "Jul", "Aug","Sep", "Oct", "Nov", "Dec"
        };
        String ans = format[format.length-1]  + "-";
        int index = -1;
        for(int i=0; i<months.length; i++){
            if(months[i].equals(format[1])){
                index = i + 1;
                break;
            }
        }
        if(index <= 9){
            ans += "0";
        }
        ans += index + "-";
        String temp = "";
        for(int i=0; i<=1;i++){
            if(Character.isDigit(format[0].charAt(i))){
                temp += format[0].charAt(i);
            }else{
                temp = "0" + temp;
            }
        }
        return ans + temp;
    }
}