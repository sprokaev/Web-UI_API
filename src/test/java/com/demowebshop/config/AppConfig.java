package com.demowebshop.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/env.properties"})
public interface AppConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("baseURI")
    String baseURI();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @DefaultValue("")
    String videoStorage();
}
