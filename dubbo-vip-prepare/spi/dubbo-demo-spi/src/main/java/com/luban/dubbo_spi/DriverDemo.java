package com.luban.dubbo_spi;

import com.luban.dubbo_spi.api.Car;
import com.luban.dubbo_spi.api.Driver;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.config.spring.extension.SpringExtensionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class DriverDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        SpringExtensionFactory.addApplicationContext(context);

        ExtensionLoader<Driver> extensionLoader =
                ExtensionLoader.getExtensionLoader(Driver.class);

        Driver driver = extensionLoader.getExtension("trucker");
//        Map<String, String> map = new HashMap<>();
//        map.put("carType", "red");
//        URL url = new URL("", "", 0, map);
        driver.driveCar(null);


//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
