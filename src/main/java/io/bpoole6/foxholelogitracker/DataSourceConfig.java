package io.bpoole6.foxholelogitracker;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Value("${database.user}")
    private String user;

    @Value("${database.url}")
    private String url;

    @Value("${database.pass}")
    private String password;

    @Bean
    public DataSource localDataSouce(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setUrl(url);

        ds.setMaxTotal(10);
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);
        return ds;
    }


}