package com.sishuok.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by youx on 2017-05-04.
 */
public class HelloTest {


    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config-hello.xml");
        Hello h=context.getBean("hello",Hello.class);
        h.sayHello();
    }
}
