package test;

import org.apache.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.log4j.jdbc.JDBCAppender;
import org.apache.log4j.net.SocketAppender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class assignment2 {

    static Logger l = LogManager.getLogger(assignment2.class);

    public static void main(String[] args) throws IOException {

        System.out.println("\n Hello World \n");
        l.trace("trace message.");
        List ev = new ArrayList();

        l.info("info message.");
        l.error("error message.");
        l.warn("warn message.");
        l.fatal("fatal message.");

        System.out.println("\ncompleted.");
    }
}
