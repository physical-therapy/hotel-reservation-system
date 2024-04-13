package org.physicaltherapy.hotelservice.usecase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.physicaltherapy.hotelservice.usecase"}, lazyInit = true)
public class UseCaseConfig {
}
