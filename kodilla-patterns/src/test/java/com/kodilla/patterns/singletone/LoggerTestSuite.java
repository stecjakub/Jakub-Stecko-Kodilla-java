package com.kodilla.patterns.singletone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void creatingLogs(){
        logger = Logger.INSTANCE;
        logger.log("First Log");
        logger.log("Second Log");
        logger.log("Last Log");
    }
    @Test
    void testGetLastLog(){
        String LastLog = logger.getLastLog();
        Assertions.assertEquals("Last Log", LastLog);
    }
}
