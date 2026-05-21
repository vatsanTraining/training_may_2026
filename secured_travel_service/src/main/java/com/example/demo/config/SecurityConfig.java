package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

import org.springframework.security.core.userdetails.UserDetails;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	
	@Bean
	BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	UserDetailsService  users(BCryptPasswordEncoder encoder) {
		
		UserDetails adminUser = User.builder().username("india").password(encoder.encode("india")).roles("ADMIN").build();

		UserDetails guestUser = User.builder().username("nepal").password(encoder.encode("nepal")).roles("GUEST").build();

		
		return new InMemoryUserDetailsManager(adminUser,guestUser);
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		
		http
		.csrf(csrf -> csrf.disable()) 
		.authorizeHttpRequests(auth -> auth
		.requestMatchers("/api/v1/tours").permitAll()
		.requestMatchers(HttpMethod.POST, "/api/v1/tours").hasRole("ADMIN")
		.anyRequest().authenticated()
		)
		.httpBasic(Customizer.withDefaults());
		return http.build();
	
	}
}

