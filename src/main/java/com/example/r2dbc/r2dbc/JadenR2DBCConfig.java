package com.example.r2dbc.r2dbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;


@Configuration
@EnableR2dbcAuditing
@EnableR2dbcRepositories (basePackages = "com.example.r2dbc.r2dbc")
public class JadenR2DBCConfig{
    @Bean("mysql")
    public ConnectionFactory mysqlConnectionFactory() {
        ConnectionFactory connectionFactory = ConnectionFactories.get(
            "r2dbcs:mysql://jaden:jaden@192.168.0.28:3306/JADEN");
        return connectionFactory;
    }
}
