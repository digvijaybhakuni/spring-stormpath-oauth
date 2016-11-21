/**
 * 
 */
package com.dgstack.spring.oauth2;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static com.stormpath.spring.config.StormpathWebSecurityConfigurer.stormpath;
/**
 * @author dbhakuni
 *
 */
public class RestSecurityWebAppConfig extends WebSecurityConfigurerAdapter{

	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.apply(stormpath()).and()
            .authorizeRequests()
            .antMatchers("/").permitAll();
    }
    
}
