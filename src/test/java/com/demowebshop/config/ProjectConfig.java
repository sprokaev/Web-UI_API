package com.demowebshop.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/env.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("http://demowebshop.tricentis.com")
    String baseUrl();

    @DefaultValue("http://demowebshop.tricentis.com")
    String baseURI();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("91.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("")
    String remoteDriverUrl();

    @DefaultValue("")
    String videoStorage();

    String login();

    String password();
}
