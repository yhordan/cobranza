package com.leonxiiicobranza.cobranza;

import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {

    @Bean
    public PhysicalNamingStrategy physical() {
        return new CustomPhysicalNamingStrategy();
    }
}