package org.test.bookpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * Author: 王俊超
 * Date: 2017-04-04 10:16
 * All Rights Reserved !!!
 */
public class StartupRunner implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("hello");
    }
}
