package mt.logistics.tensorflow.usecase.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogTextLine {

    private String message;
    private String newLine = "\n";

    public String createMessage(String message) {
        this.message = message;
        return newLine + logStamp() + this.message;
    }

    private String logStamp() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String time = formatter.format(date);
        return time + " :: ";
    }
}
