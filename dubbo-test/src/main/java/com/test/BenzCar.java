package com.test;

import org.apache.dubbo.common.URL;

public class BenzCar implements CarInterface{

    private CarInterface carInterface;

    // 注入点
    public void setCarInterface(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor() {

        System.out.println("Benz Car");
    }

    @Override
    public void getColorURL(URL url) {
        System.out.println("do Something~");
        carInterface.getColorURL(url);
    }
}
