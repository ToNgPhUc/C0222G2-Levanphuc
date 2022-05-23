package case_study.common.nowtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetTimeNow {
    public static String getTime() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dataFormat.format(calendar.getTime());
    }
}
