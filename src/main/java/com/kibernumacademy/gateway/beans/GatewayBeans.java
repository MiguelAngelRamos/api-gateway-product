package com.kibernumacademy.gateway.beans;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayBeans {
  @Bean
  public RouteLocator routeLocator(RouteLocatorBuilder builder) {
    return builder
            .routes()
            .route(route -> route
                    .path("/product-msv/products/**")
                    .uri("http://localhost:54997"))
            .route(route->route
                    .path("/report-ms/report/**")
                    .uri("http://localhost:7070")).build();
  }
}
