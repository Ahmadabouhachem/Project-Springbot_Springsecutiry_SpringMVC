//package com.example.myfirstproject.security;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


//@Configuration
//public class SecurityConfig {

    /*
   @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){

       JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

       // define query to retrieve a user by username
       jdbcUserDetailsManager.setUsersByUsernameQuery(
               "select user_id, pw, active from members where user_id=?");

       // define query to retrieve a user by roll
       jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
               "select user_id, role from roles where user_id=?");

       return jdbcUserDetailsManager;
    }
*/

/*
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails ahmadAdmin = User.builder()
                .username("ahmad")
                .password("{bcrypt}$2a$10$Y9u2ihG0wp/qBOgoSpAfoulP/QLs8CFMmTnTR1qpA2en4j/iGxOQO")
                .roles("USER", "MANAGER", "ADMIN")
                .build();

        UserDetails ahmadManager = User.builder()
                .username("basel")
                .password("{bcrypt}$2a$10$7krRtFMBiyCUstEmQ4jBUOdjoL8egwqTvfOSt0Umhe4dpizpiPhB.")
                .roles("USER", "MANAGER")
                .build();

        UserDetails ahmadUser = User.builder()
                .username("najm")
                .password("{bcrypt}$2a$10$QSEAsmiGHmXwffcJgOXJXeZCiCb42mGgmnxGCPRNVoeRsKOIrupbO")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(ahmadAdmin,ahmadManager,ahmadUser);
    }
*/
    /*
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configurer -> configurer
                .requestMatchers(HttpMethod.GET,"/customer").hasRole("USER")
                .requestMatchers(HttpMethod.GET,"/customer/home").hasRole("USER")
                .requestMatchers(HttpMethod.GET,"/customer/home /processForm").hasRole("USER")

                .requestMatchers(HttpMethod.GET,"/school").hasRole("USER")
                .requestMatchers(HttpMethod.GET,"/school/students").hasRole("USER")

                .requestMatchers(HttpMethod.GET,"/home").hasRole("USER")
                .requestMatchers(HttpMethod.GET,"/home/coachinfo").hasRole("USER")

                .requestMatchers(HttpMethod.GET,"/office").hasRole("USER")
                .requestMatchers(HttpMethod.GET,"/office/employees").hasRole("USER")
                .requestMatchers(HttpMethod.GET,"/office/employees/**").hasRole("USER")
                .requestMatchers(HttpMethod.POST,"/office/employees").hasRole("MANAGER")
                .requestMatchers(HttpMethod.PUT,"/office/employees").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE,"/office/employees/**").hasRole("ADMIN")
        );

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
*/


//}