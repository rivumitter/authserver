package com.rivu.authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AuthserverConfig {

//    @Bean
//    UserDetailsService inmemoryUserDetailsManger() {
//        var userBuilder = User.builder();
//
//        return new InMemoryUserDetailsManager(
//                userBuilder.username("rivu").password("{noop}pwd").build(),
//                userBuilder.username("rima").password("{noop}pwd").build()
//        );
//    }
}
