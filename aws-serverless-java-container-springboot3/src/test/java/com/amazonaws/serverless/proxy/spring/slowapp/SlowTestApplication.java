package com.amazonaws.serverless.proxy.spring.slowapp;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication(exclude = {
        org.springframework.boot.security.autoconfigure.ReactiveUserDetailsServiceAutoConfiguration.class,
        org.springframework.boot.security.autoconfigure.web.reactive.ReactiveWebSecurityAutoConfiguration.class,
        org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration.class,
        org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration.class,
        org.springframework.boot.security.autoconfigure.web.servlet.ServletWebSecurityAutoConfiguration.class,
})
public class SlowTestApplication {

    @Component
    public static class SlowDownInit implements InitializingBean {
        public static final int INIT_SLEEP_TIME_MS = 13_000;

        @Override
        public void afterPropertiesSet() throws Exception {
            Thread.sleep(INIT_SLEEP_TIME_MS);
        }
    }
}
