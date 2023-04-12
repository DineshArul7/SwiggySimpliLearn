package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {

    @Test
    public void testLog(){
        Logger logger= LogManager.getLogger(getClass().getName());
        logger.debug("Deekay");
        logger.error("Dee");
        logger.info("Muthu");
    }
}
