package com.portfolio.portfolioapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                // CSRF disable (forms ke liye easy)
                .csrf(csrf -> csrf.disable())

                // Sab pages allow (login controller handle karega)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/",
                                "/login",
                                "/signup",
                                "/dashboard",
                                "/admin/**",
                                "/css/**",
                                "/js/**"
                        ).permitAll()
                        .anyRequest().permitAll()
                )

                // Spring Security ka login disable
                .formLogin(login -> login.disable())

                // Logout bhi disable (hum session se handle karenge)
                .logout(logout -> logout.disable());

        return http.build();
    }
}