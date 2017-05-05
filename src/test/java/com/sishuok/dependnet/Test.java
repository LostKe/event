package com.sishuok.dependnet;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;


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
        System.out.println(storeText);
        storeText.store("bessdsdsadsdt exe");
        StoreText storeTex1=context.getBean("storeText",StoreText.class);
        System.out.println(storeTex1);


    }
}
