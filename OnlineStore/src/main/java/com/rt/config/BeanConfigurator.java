package com.rt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={PersistenceConfigurator.class,ServiceConfigurator.class,AOPConfig.class})
public class BeanConfigurator {

}
