package com.test;

import org.apache.dubbo.common.URL;

public class CarWrapper2 implements CarInterface{

    private CarInterface carInterface;

    public CarWrapper2(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor() {
        System.out.println("before2");
        carInterface.getColor();
        System.out.println("after2");
    }

    @Override
    public void getColorURL(URL url) {
        carInterface.getColorURL(url);
    }
}
