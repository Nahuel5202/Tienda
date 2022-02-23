package com.example.ProyectoEgg.configuraciones;

import com.example.ProyectoEgg.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class ConfiguracionesSeguridades extends WebSecurityConfigurerAdapter {


@Autowired
public UsuarioService usuarioServis;

@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
    auth.userDetailsService(usuarioServis).passwordEncoder( new BCryptPasswordEncoder());
}




    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/*", "/js/*","/img/*", "/**")
                .permitAll()
                .and().formLogin()
                                   .loginPage("/login") // Que formulario esta mi login
                                         .loginProcessingUrl("/logincheck")
                                          .usernameParameter("username") // Como viajan los datos del logueo
                                          .passwordParameter("password")// Como viajan los datos del logueo
                                           .defaultSuccessUrl("/inicio") // A que URL viaja
                                           .permitAll()
                .and().logout() // Aca configuro la salida
                          .logoutUrl("/logout")
                          .logoutSuccessUrl("/prueba")
                          .permitAll().and().csrf().disable();
    }
}
