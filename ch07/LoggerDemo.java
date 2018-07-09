import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("main method is executing.");
        logger.warning("warning msg...");
        logger.logp(Level.INFO, "LoggerDemo", "main", "test logging stack trace");
    }

}