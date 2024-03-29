package com.leonxiiicobranza.cobranza.jwt.auth;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.leonxiiicobranza.cobranza.jwt.service.CustomUserDetailsService;



@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    private final CustomUserDetailsService userDetailsService;
    private final JwtAuthorizationFilter jwtAuthorizationFilter;

    public SecurityConfig(CustomUserDetailsService customUserDetailsService, JwtAuthorizationFilter jwtAuthorizationFilter) {
        this.userDetailsService = customUserDetailsService;
        this.jwtAuthorizationFilter = jwtAuthorizationFilter;

    }
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http,PasswordEncoder  noOpPasswordEncoder) //NoOpPasswordEncoder PasswordEncoder
            throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(noOpPasswordEncoder);
        return authenticationManagerBuilder.build();
    }
    
    

     @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    	
    	 http.csrf().disable()
         .authorizeRequests()
         .requestMatchers(new AntPathRequestMatcher("/rest/auth/**")).permitAll()
         .requestMatchers(new AntPathRequestMatcher("/api/personal/enviar_correo/**")).permitAll()
         //.requestMatchers(new AntPathRequestMatcher("/rest/home")).permitAll()
         .anyRequest().authenticated()
         .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
         .and().addFilterBefore(jwtAuthorizationFilter,UsernamePasswordAuthenticationFilter.class);


    return http.build();    	   
    	
    }
 
  
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
   

}