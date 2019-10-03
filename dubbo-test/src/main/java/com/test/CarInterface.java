package com.test;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface CarInterface {
    // 获得颜色
    public void getColor();
    @Adaptive(value = "car")
    public void getColorURL(URL url);
}
