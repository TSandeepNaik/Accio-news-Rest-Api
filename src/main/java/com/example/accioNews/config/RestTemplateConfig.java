package com.example.accioNews.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
when ever u start the application spring create the bean for your all class like for service class, repository class, controller class
like wise configuration class also helps to create the bean but they are special bean which we can configure based on our requirements
configuration classes contain the configuration of special bean
like here we are configuring for RestTemplate
*/
@Configuration
public class RestTemplateConfig {

    //will create the method and will implement the configuration
    @Bean   // it will create the  bean of return type like here it will create the bean of RestTemplate
    //bean - object created by the spring
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
