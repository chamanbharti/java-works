package com.landonhotel;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends 
	AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootAppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { 
        		MainWebConfiguration.class, 
        		ApiWebConfiguration.class 
        	};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/main/*", "/api/*" };
    }

}
