package monitors.temperature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
// Component Scan the specified packages
@ComponentScan(basePackages={"monitors.temperature","monitors.motion"})
public class WebConfig extends WebMvcConfigurerAdapter {

  // Create the ViewResolver Bean which the framework will look for to determine
  // where the view files are. In this case they are JSP files.
  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    return resolver;
  }

//	@Override
//	public void configureContentNegotiation (ContentNegotiationConfigurer configurer) {
//		configurer.defaultContentType(MediaType.APPLICATION_JSON);
//	}
//	
//	@Bean
//	public ViewResolver cnViewResolver(ContentNegotiationManager cnm) {
//		ContentNegotiatingViewResolver cnvr = new ContentNegotiatingViewResolver();
//		cnvr.setContentNegotiationManager(cnm);
//		return cnvr;
//	}
	
  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }
  
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // TODO Auto-generated method stub
    super.addResourceHandlers(registry);
  }

}