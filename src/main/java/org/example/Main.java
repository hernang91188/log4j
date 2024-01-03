package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        for (int i = 0; i <8000 ; i++) {
            logger.info("Hello, Log4j!");

        }
        logger.info("Hello, Log4j!");
        logger.error("This is an error message.");
        System.out.println("Hello world!");
    }




}