package com.test.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.File;

/**
 * Created by Seed on 2017/8/23.
 */
public class LogbackConfigListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        String path = event.getServletContext().getRealPath("/WEB-INF/");

        File file = new File(path,"logs");
        if (!file.exists()) {
            file.mkdir();
        }
        System.setProperty("webapp.path", path+"/logs");
        Log.info("加载日志成功！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }
}
