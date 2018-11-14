package com.thrymr.cnfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.thrymr.dao,com.thrymr,service"})
public class AppConfig {

}
