package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.bookpub.repository.BookRepository;

/**
 * Author: 王俊超
 * Date: 2017-04-04 10:53
 * All Rights Reserved !!!
 */
public class StartupRunner implements CommandLineRunner{
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private BookRepository bookRepository;

    public void run(String... args) throws Exception {
        logger.info("Number of books: " + bookRepository.count());
    }

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
        logger.info("Number of books: " + bookRepository.count());
    }
}
