package com.bootcamp.camp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	        auth.userDetailsService(username -> {
    	            if ("admin".equals(username)) {
    	                return User.builder()
    	                        .username("admin")
    	                        .password(passwordEncoder().encode("adminpass"))
    	                        .roles("ADMIN")
    	                        .build();
    	            } else {
    	                throw new UsernameNotFoundException("User not found");
    	            }
    	        });
    	    }

}
