package com.test;

import org.apache.dubbo.common.URL;

public class RedCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("red");
    }

    @Override
    public void getColorURL(URL url) {
        System.out.println("red url");
    }
}
