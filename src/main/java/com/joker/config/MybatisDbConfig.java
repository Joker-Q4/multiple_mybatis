package com.joker.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class MybatisDbConfig {

    @MapperScan(basePackages = {"com.joker.mapper"}, sqlSessionFactoryRef = Source.sqlSessionFactory)
    public static class MybatisDbBDConfig {

        @Resource
        @Qualifier(Source.DYNAMIC)
        private DataSource dynamicDataSource;

        @Bean(Source.sqlSessionFactory)
        public SqlSessionFactory dynamicSqlSessionFactory() throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dynamicDataSource);
            return factoryBean.getObject();
        }

        @Bean
        public SqlSessionTemplate sqlSessionTemplate(
                @Qualifier(Source.sqlSessionFactory) SqlSessionFactory dynamicSessionFactory) {
            return new SqlSessionTemplate(dynamicSessionFactory);
        }
    }
}
