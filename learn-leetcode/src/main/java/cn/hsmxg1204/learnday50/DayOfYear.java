package cn.hsmxg1204.learnday50;

import java.util.Arrays;
import java.util.HashMap;

/**
 * TODO
 *
 * @author gxming
 * @description 一年中的第几天
 * @date 2021-12-21 16:38
 */
public class DayOfYear {


    public static int dayOfYear(String date){
        HashMap<String, Integer> months = new HashMap<>();
        months.put("01",0);
        months.put("02",31);
        months.put("03",59);
        months.put("04",90);
        months.put("05",120);
        months.put("06",151);
        months.put("07",181);
        months.put("08",212);
        months.put("09",243);
        months.put("10",273);
        months.put("11",304);
        months.put("12",334);

        String[] day = date.split("-");
        System.out.println(Arrays.toString(day));
        int days = months.get(day[1]);
        int curMonthDay = Integer.parseInt(day[2]);
        if(days == 0){
            return curMonthDay;
        }
        int year = Integer.parseInt(day[0]);

        if(isLeapYear(year) && Integer.parseInt(day[1]) > 2){
            return days + curMonthDay + 1;
        }
        return days + curMonthDay;
    }


    public static int dayOfYear2(String date){
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            ++amount[1];
        }

        int ans = 0;
        for (int i = 0; i < month - 1; ++i) {
            ans += amount[i];
        }
        return ans + day;
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0||( year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        String date = "2016-02-09";
        System.out.println(dayOfYear(date));
    }
}
