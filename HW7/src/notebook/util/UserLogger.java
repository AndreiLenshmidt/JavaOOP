package notebook.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserLogger {
    private String datetime;
    private String command;
    private Long userID;

    public UserLogger(String command, Long userID) {
        this.datetime = getDateTime();
        this.command = command;
        this.userID = userID;
    }

    DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");
    String date = dateFormat.format(new Date());
    
    public String getDateTime() {
        return date;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getCommand() {
        return command;
    }

    public Long getUserID() {
        return userID;
    }


}
