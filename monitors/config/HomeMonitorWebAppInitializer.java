package monitors.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import monitors.temperature.WebConfig;

//--------------------------------------------------------------------------------//
// This derived class sets up the configuration for the Spring app.				  //
//--------------------------------------------------------------------------------//
public class HomeMonitorWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	//--------------------------------------------------------------------------------//
    // The Root Config Classes are all other non-web components in the application	  //
	//--------------------------------------------------------------------------------//
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//------------------------------------------------------------------------------------------------------//
    // The Servlet Config Classes are those that contain web components such as Controllers, View Resolvers	//
	// and handler mappings.																				//
	//------------------------------------------------------------------------------------------------------//
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	//--------------------------------------------------------------------------------//
	// URLs that match the specified pattern are serviced by this DispatcherServlet   //
	//--------------------------------------------------------------------------------//
	@Override
	protected String[] getServletMappings() {
	    return new String[] { "/" };
	}

}
