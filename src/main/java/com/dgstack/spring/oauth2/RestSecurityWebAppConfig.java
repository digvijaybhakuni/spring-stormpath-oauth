/**
 * 
 */
package com.dgstack.spring.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.stormpath.spring.config.StormpathWebSecurityConfigurer;

/**
 * @author dbhakuni
 *
 */
@Configuration
public class RestSecurityWebAppConfig extends WebSecurityConfigurerAdapter{

	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.apply(StormpathWebSecurityConfigurer.stormpath()).and()
            .authorizeRequests()
            .antMatchers("/").permitAll();
    }
    
}
