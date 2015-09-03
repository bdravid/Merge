package com.dravid.merge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bdravid on 03/09/2015.
 */
public class Bootstrap {
    private static final Logger logger = LoggerFactory.getLogger(Bootstrap.class);
    public static void main(String args[]){
        logger.debug("Loading context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        App app = (App) context.getBean("app");
        logger.info("Starting app {}", app.getName());
    }
}
