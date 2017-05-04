package com.sishuok.hello;

/**
 * Created by youx on 2017-05-04.
 */
public class Hello {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("setter method is invoke");
    }

    public void sayHello(){
       System.out.println("["+userName+"]: say Hello");
    }
}
