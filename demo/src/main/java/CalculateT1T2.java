import java.util.Calendar;
import java.util.Date;

public class CalculateT1T2 {
    Calendar calendar;
    public Date getT1(){
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return calendar.getTime();
    }

    public Date getT2(){
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        return calendar.getTime();
    }
}
