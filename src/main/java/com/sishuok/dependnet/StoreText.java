package com.sishuok.dependnet;

import java.io.IOException;

/**
 * Created by youx on 2017-05-04.
 */
public class StoreText {

    FileHelper fileHelper;


    public  void init() throws IOException {
        System.out.println("StoreText:初始化");
        fileHelper.getFos().write("=====spring dependent study====".getBytes());
    }

    public void destory() throws IOException {
        System.out.println("StoreText:销毁");
        fileHelper.getFos().write("======the end ========".getBytes());
    }


    public void store(String text) throws IOException {
        System.out.println("StoreText:开始写入数据");
        fileHelper.getFos().write(("=====写入数据===="+text).getBytes());
    }
    public FileHelper getFileHelper() {
        return fileHelper;
    }

    public void setFileHelper(FileHelper fileHelper) {
        this.fileHelper = fileHelper;
    }
}
