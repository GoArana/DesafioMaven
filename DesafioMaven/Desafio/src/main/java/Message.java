import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Message {

    final static Logger logger = LogManager.getLogger(Message.class);
    public void warnMessage(String parameter) {
        logger.warn(parameter);
    }

    public void debugMessage(String parameter) {
        logger.debug(parameter);
    }

    public void traceMessage(String parameter) {
        logger.trace(parameter);
    }

    public void fatalMessage(String parameter) {
        logger.fatal(parameter);
    }

    public void infoMessage(String parameter) {
        logger.info(parameter);
    }

    public void errorMessage(String parameter) {
        logger.error(parameter);
    }

}

