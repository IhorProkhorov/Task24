package twentyfour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {

    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            loggerWarn.warn("Warning message from {}", LoggerExample.class.getSimpleName());
            loggerError.error("Error message from {}", LoggerExample.class.getSimpleName());
            loggerInfo.info("INFO log from {}", LoggerExample.class.getSimpleName());
        }
    }

}
