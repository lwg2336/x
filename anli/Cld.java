package anli;

import java.util.Calendar;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-25 19:31
 */
public class Cld {

    String[] Day;
    int year,month;
    void setDemo(int year, int month){//从主类获取年月信息
        this.year = year;
        this.month = month;
    }
    public String[] getCalendar() {//设置月历
        String[] a = new String[42];
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
        int day = 0;
        //下面这段冗长的部分就是判断每个月的天数，，但我觉得太长了，可以短一点的，（确实）
        if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
            day = 31;
        }
        else if(month == 4||month == 6||month == 9||month == 11){
            day = 30;
        }
        else if(month == 2){
            if(((year % 4 == 0)&&(year % 100 != 0))||(year % 400 == 0)){
                day = 29;
            }
            else {
                day = 28;
            }
        }
        for (int i=0;i<dayOfWeek;i++)a[i]="";
        for(int i=dayOfWeek,n=1;i<day+dayOfWeek;i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        for(int i = dayOfWeek+day;i<a.length;i++)
        {
            a[i]="";
        }
        return a;


    }
}
