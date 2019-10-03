package com.test;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader =
                ExtensionLoader.getExtensionLoader(CarInterface.class);
        CarInterface carInterface = extensionLoader.getExtension("benz");
        Map<String, String> map = new HashMap<>();
        map.put("car", "red");
        URL url = new URL("", "", 1, map);
        carInterface.getColorURL(url);
    }
}
