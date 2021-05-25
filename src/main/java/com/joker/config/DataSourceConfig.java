package com.joker.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(Source.DYNAMIC)
    public DataSource dataSource(@Qualifier(Source.MYSQL) DataSource mysql,
                                 @Qualifier(Source.ORACLE) DataSource oracle) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(mysql);
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap<>(2);
        dsMap.put(Source.MYSQL, mysql);
        dsMap.put(Source.ORACLE, oracle);
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    @Bean(Source.MYSQL)
    public DataSource dataSourceMysql() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/user?serverTimezone=GMT%2b8&characterEncoding=utf-8")
                .username("root")
                .password("root")
                .build();
    }

    @Bean(Source.ORACLE)
    public DataSource dataSourceOracle() {
        return DataSourceBuilder.create()
                .driverClassName("oracle.jdbc.OracleDriver")
                .url("jdbc:oracle:thin:@localhost:1521:orcl12")
                .username("root")
                .password("root")
                .build();
    }
}