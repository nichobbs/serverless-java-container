package com.amazonaws.serverless.proxy.spring.webfluxapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
                org.springframework.boot.security.autoconfigure.ReactiveUserDetailsServiceAutoConfiguration.class,
                org.springframework.boot.security.autoconfigure.web.reactive.ReactiveWebSecurityAutoConfiguration.class,
                org.springframework.boot.security.autoconfigure.UserDetailsServiceAutoConfiguration.class,
                org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration.class,
                org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration.class,
                org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration.class,
                org.springframework.boot.security.autoconfigure.web.servlet.ServletWebSecurityAutoConfiguration.class
})
public class WebFluxTestApplication {

}
