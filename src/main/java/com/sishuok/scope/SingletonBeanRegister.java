package com.sishuok.scope;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

/**
 * Created by youx on 2017-05-04.
 */
public class SingletonBeanRegister implements SingletonBeanRegistry {

    public void registerSingleton(String beanName, Object singletonObject) {

    }

    public Object getSingleton(String beanName) {
        return null;
    }

    public boolean containsSingleton(String beanName) {
        return false;
    }

    public String[] getSingletonNames() {
        return new String[0];
    }

    public int getSingletonCount() {
        return 0;
    }
}
