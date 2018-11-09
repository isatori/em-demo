package com.community.admin.configuration;

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
                .username("vhapjvhybfunwm")
                .password("03d2579086d02d9d7f742378a3a10b6ae034471d26a75276fc2928eadad1e1de")
                .url("jdbc:postgresql://ec2-184-73-169-151.compute-1.amazonaws.com:5432/d5kbpln20fi0rr")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(2);
        return dataSource;
    }

    @Bean
    @Qualifier("webSecureDS")
    public DataSource webSecureDS() {
        DataSource dataSource = DataSourceBuilder
                .create()
//                .username("postgres")
//                .password("mysecretpassword")
//                .url("jdbc:postgresql://localhost:5432/broadleaf")
                .username("vhapjvhybfunwm")
                .password("03d2579086d02d9d7f742378a3a10b6ae034471d26a75276fc2928eadad1e1de")
                .url("jdbc:postgresql://ec2-184-73-169-151.compute-1.amazonaws.com:5432/d5kbpln20fi0rr")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(1);
        return dataSource;
    }

    @Bean
    @Qualifier("webStorageDS")
    public DataSource webStorageDS() {
        DataSource dataSource = DataSourceBuilder
                .create()
//                .username("postgres")
//                .password("mysecretpassword")
//                .url("jdbc:postgresql://localhost:5432/broadleaf")
                .username("vhapjvhybfunwm")
                .password("03d2579086d02d9d7f742378a3a10b6ae034471d26a75276fc2928eadad1e1de")
                .url("jdbc:postgresql://ec2-184-73-169-151.compute-1.amazonaws.com:5432/d5kbpln20fi0rr")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(1);
        return dataSource;
    }

    @Bean
    @Qualifier("webEventDS")
    public DataSource webEventDS() {
        DataSource dataSource = DataSourceBuilder
                .create()
//                .username("postgres")
//                .password("mysecretpassword")
//                .url("jdbc:postgresql://localhost:5432/broadleaf")
                .username("vhapjvhybfunwm")
                .password("03d2579086d02d9d7f742378a3a10b6ae034471d26a75276fc2928eadad1e1de")
                .url("jdbc:postgresql://ec2-184-73-169-151.compute-1.amazonaws.com:5432/d5kbpln20fi0rr")
                .driverClassName("org.postgresql.Driver")
                .type(org.apache.tomcat.jdbc.pool.DataSource.class)
                .build();
        ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).setMaxActive(1);
        return dataSource;
    }

}
