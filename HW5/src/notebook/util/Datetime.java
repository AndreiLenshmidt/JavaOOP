package notebook.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime {

    DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");
    String date = dateFormat.format(new Date());
    
    public String getDateTime() {
        return date;
    }
}
