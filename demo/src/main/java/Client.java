import java.util.Date;

public class Client {
    WorkingDayAdapter workingDayAdapter;

    public Date getWorkingDay(int n){
        workingDayAdapter = new WorkingDayAdapter();
        return workingDayAdapter.getNthWorkingDay(n);
    }
}
