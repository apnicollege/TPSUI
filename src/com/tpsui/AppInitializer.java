package com.tpsui;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//all configuration classes will be reached out from here. 
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//Servlet configuation for view resolver. 
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//give the track of very first url which is '/'
		String[] str = new String[]{"/"};
		return str;
	}
}
