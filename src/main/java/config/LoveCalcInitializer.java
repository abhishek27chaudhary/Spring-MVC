package config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/*
public class LoveCalcInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//XmlWebApplicationContext xmlWebConfig = new XmlWebApplicationContext();
		//xmlWebConfig.setConfigLocation("classpath:application-config.xml");
		
		//Remember the below class properly
		AnnotationConfigWebApplicationContext webAppConf = new AnnotationConfigWebApplicationContext();
		webAppConf.register(LoveCalcAppConfig.class);
		
		//create a dispatcher servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppConf);
		
		ServletRegistration.Dynamic servletReg =servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		servletReg.setLoadOnStartup(1);
		servletReg.addMapping("/myWebsite.com/*");
		System.out.println("Yaha tak to aa gya");
	}

}
*/