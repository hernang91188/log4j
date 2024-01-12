package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    private static final Logger fileLogger1 = LogManager.getLogger("FileLogger1");
    private static final Logger fileLogger2 = LogManager.getLogger("FileLogger2");
    public static void main(String[] args) {

        for (int i = 0; i <8000 ; i++) {
            logger.info("Hello, Log4j!");
            fileLogger1.info("Hello, app1!");
            fileLogger2.info("Hello, app2j!");
        }
        logger.info("Hello, Log4j!");
        logger.error("This is an error message.");
        System.out.println("Hello world!");
    }




}