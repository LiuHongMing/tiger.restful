package junit;

import java.util.logging.Logger;

import org.apache.logging.log4j.jul.LogManager;

interface Log {
}

public class Log4j2Jul implements Log {

    void log() {
        System.out.println("Log downward Log4j2Jul");
    }

    public static void main(String[] args) {
        Logger LOGGER = new LogManager().getLogger("logging.filter");
        LOGGER.info("你好啊");

        Log4j2Jul log4j2Jul = (Log4j2Jul) getInstance();
        log4j2Jul.log();
    }

    static Log getInstance() {
        return new Log4j2Jul();
    }

}
