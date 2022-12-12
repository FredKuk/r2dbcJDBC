package com.example.r2dbc.jdbc;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import com.zaxxer.hikari.HikariDataSource;

@EnableJdbcRepositories(basePackages = "com.example.r2dbc.jdbc")
@EnableJdbcAuditing
@Configuration
public class JdbcConfig {
    
    @Bean
    @ConfigurationProperties("spring.jaden.datasource")
    DataSourceProperties jadenDataSourceProperties(){
        return new DataSourceProperties();
    }
    
    @Primary
    @Bean(name="jadenDataSource")
    DataSource jadenDataSource(){
        return jadenDataSourceProperties()
            .initializeDataSourceBuilder()
            .type(HikariDataSource.class)
            .build();
    }
}
