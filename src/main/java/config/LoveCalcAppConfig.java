package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "controllers")
public class LoveCalcAppConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver internalViewResolver = new InternalResourceViewResolver();
		internalViewResolver.setPrefix("/WEB-INF/view/");
		internalViewResolver.setSuffix(".jsp");
		return internalViewResolver;
	}

}
