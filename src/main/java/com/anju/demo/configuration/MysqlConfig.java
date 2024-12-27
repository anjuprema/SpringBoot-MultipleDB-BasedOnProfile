package com.anju.demo.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mysql")
public class MysqlConfig {
	@Bean
	@ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        return builder.build();
    }
}
