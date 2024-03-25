package com.example.TestCRUD.сonfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/students/").authenticated()
                .antMatchers("/csrf/token").permitAll() // Разрешить доступ к /csrf/token без аутентификации
                .anyRequest().permitAll()
                .and()
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .oauth2Login();



    }
}
/*.authorizeRequests()
        .antMatchers("/students/").authenticated()
        .anyRequest().permitAll()
        .and()
        .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()) // Включить CSRF-защиту с использованием Cookie
        .and()
        .oauth2Login();*/

/*.authorizeRequests()
        .antMatchers("/students/").authenticated() // Требовать аутентификацию для доступа к /students/
        .anyRequest().permitAll() // Разрешить доступ ко всем эндпоинтам без аутентификации
        .and()
        .oauth2Login(); // Включить поддержку OAuth2.0 для входа в систему*/

 /*.authorizeRequests()
         .antMatchers("/oauth/token").permitAll() // Разрешить доступ к эндпоинту для получения токена
         .anyRequest().authenticated()
         .and()
         .oauth2Login(); // Включить поддержку OAuth2.0 для входа в систему
*/


        /*.authorizeRequests()
                .anyRequest().permitAll() // Разрешить доступ ко всем эндпоинтам без аутентификации
                .and()
                .csrf().disable(); // Отключить CSRF защиту*/

