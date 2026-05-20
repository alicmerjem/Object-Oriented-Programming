package org.example;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("[" + timestamp +"]");

    }
}

class TestingLogger {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        System.out.println("Are logger 1 and logger 2 the same?");
        System.out.println(l1 == l2);
        System.out.println();
    }
}
