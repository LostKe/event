package com.sishuok.dependnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

/**
 * Created by youx on 2017-05-04.
 */
public class Test {

    @org.junit.Test
    public  void Test() throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config-dependnet.xml");
        context.registerShutdownHook();

        StoreText storeText=context.getBean("storeText",StoreText.class);
        storeText.store("best exe");
    }
}
