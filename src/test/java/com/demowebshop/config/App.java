package com.demowebshop.config;

import org.aeonbits.owner.ConfigFactory;

public class App {

    public static final AppConfig config = ConfigFactory.create(AppConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
