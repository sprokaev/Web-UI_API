package com.demowebshop.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/env.properties"})
public interface ProjectConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("baseURI")
    String baseURI();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();
}
