package com.example.tuionf.retrofitlearn;

/**
 * Created by tuion on 2017/8/26.
 */

public class Translation {

    private String status;
    private content content;
    private static class content{
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }

    public void show() {
        System.out.println(status);
        System.out.println(content.from);
        System.out.println(content.to);
        System.out.println(content.vendor);
        System.out.println(content.out);
        System.out.println(content.errNo);
    }

}
