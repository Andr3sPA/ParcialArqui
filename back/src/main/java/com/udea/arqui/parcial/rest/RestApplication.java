package com.udea.arqui.parcial.rest;

import java.util.List;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Bean
    OpenApiCustomizer openApiCustomizer() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");

        Server deployServer = new Server();
        deployServer.setUrl("https://9mtl64dl-8080.use2.devtunnels.ms");

        return openApi -> {
            openApi.info(new Info()
                    .title("Weather API")
                    .description("Basic API for information about cities' weather"))
                    .servers(List.of(deployServer, devServer));
        };
    }
}
