class Solution {
    public int dayOfYear(String date) {
        String[] dates = date.split("-");
        int[] months = new int[] {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        
        if(isLeapYear(Integer.parseInt(dates[0]))){
            months[1] += 1;
        }
        int month = Integer.parseInt(dates[1]);
        int k = 1;
        int days = 0;
        while(k <=  month){
            if(k == month){
                days += Integer.parseInt(dates[2]);
            }else{
                days += months[k-1];
            }
            k++;
        }
        return days;
    }

      private boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if(year % 4 == 0){
            isLeapYear = true;
            if(year % 100 == 0){
                isLeapYear = year % 400 == 0;
            }
        }
        return isLeapYear;
    }
}