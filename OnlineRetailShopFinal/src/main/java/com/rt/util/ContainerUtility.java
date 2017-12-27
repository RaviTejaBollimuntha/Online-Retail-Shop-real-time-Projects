package com.rt.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rt.config.BeanConfigurator;

public class ContainerUtility {

	  public static final ApplicationContext ctx;

	  static {
	    try {
	    	 ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);     
	    } catch (Throwable ex) {
	      System.err.println("IOC Container creation failed." + ex);
	      throw new ExceptionInInitializerError(ex);
	    }
	  }
	  
	 	  public static ApplicationContext getContainer() {
	 		if(ctx!=null) {
	 			return ctx;
	 		}else	         
			return null;
	 		
	  }

	 

}
