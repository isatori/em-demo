package com.community.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    @Qualifier("webDS")
    public DataSource webDS() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .username("pclpxhhd")
                .password("1xQbe3CZ_MFVCqTazB2WFbo9DFsadfLK")
                .url("jdbc:postgresql://tantor.db.elephantsql.com:5432/pclpxhhd")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(4);
        return dataSource;
    }

    @Bean
    @Qualifier("webSecureDS")
    public DataSource webSecureDS() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .username("postgres")
                .password("mysecretpassword")
                .url("jdbc:postgresql://localhost:5432/broadleaf")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(4);
        return dataSource;
    }

    @Bean
    @Qualifier("webStorageDS")
    public DataSource webStorageDS() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .username("postgres")
                .password("mysecretpassword")
                .url("jdbc:postgresql://localhost:5432/broadleaf")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(4);
        return dataSource;
    }

}
