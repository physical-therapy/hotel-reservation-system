package org.physicaltherapy.fareservice.usecase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.physicaltherapy.fareservice.usecase"}, lazyInit = true)
public class UseCaseConfig {
}
