package com.sishuok.dependnet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by youx on 2017-05-04.
 */
public class FileHelper {
    private FileOutputStream fos;

    private File file;


    public void init(){
        System.out.println("FileHelper:初始化");
        System.out.println("FileHelper:加载资源执行预操作");
        try {
            fos=new FileOutputStream(file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void destory(){
        System.out.println("FileHelper:销毁");
        System.out.println("FileHelper:释放资源，执行清理操作");
        try {
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileOutputStream getFos() {
        return fos;
    }

    public void setFos(FileOutputStream fos) {
        this.fos = fos;
    }
}
