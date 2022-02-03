package com.demowebshop.config;

import org.aeonbits.owner.ConfigFactory;

public class App {

    public static final AppConfig config = ConfigFactory.create(AppConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("");
    }

    public static boolean isVideoTurnedOn() {
        return !config.videoStorage().equals("");
    }
}
