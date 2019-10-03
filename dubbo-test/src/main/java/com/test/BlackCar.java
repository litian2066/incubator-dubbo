package com.test;

import org.apache.dubbo.common.URL;

public class BlackCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("black");
    }

    @Override
    public void getColorURL(URL url) {

    }
}
