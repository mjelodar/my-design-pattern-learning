import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class WorkingDayAdapter implements CalculateWorkDay{
    CalculateT1T2 calculateT1T2;


    @Override
    public Date getNthWorkingDay(int n) {
        calculateT1T2 = new CalculateT1T2();
        if (n == 1){
            System.out.println("we use adapter design");
            return calculateT1T2.getT1();
        }else if (n ==2){
            System.out.println("we use adapter design");
            return calculateT1T2.getT2();
        }else {
            System.out.println("we don't use adapter design");
            return getNthWorkingDayMoreThanTwo(n);
        }
    }

    private Date getNthWorkingDayMoreThanTwo(long n){
        LocalDateTime localDateTime = LocalDateTime.now();
        return Date.from(localDateTime.plusDays(n).atZone(ZoneId.systemDefault()).toInstant());
    }
}
