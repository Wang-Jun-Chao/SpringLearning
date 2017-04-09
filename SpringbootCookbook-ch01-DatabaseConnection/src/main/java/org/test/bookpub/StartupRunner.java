package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


/**
 * Author: 王俊超
 * Date: 2017-04-04 10:27
 * All Rights Reserved !!!
 */
public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private DataSource ds;

    @Override
    public void run(String... args) throws Exception {
        logger.info("DataSource: " + ds.toString());
    }
}
