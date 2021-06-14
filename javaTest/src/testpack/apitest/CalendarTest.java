package testpack.apitest;

import java.util.Calendar;
import java.util.Scanner;

//获取任何一年的二月有多少天
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1); //设置为3月1日
        c.add(Calendar.DATE, -1); //往前推一天即是2月的最后一天
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年的2月份有" + date + "天");
    }
}
