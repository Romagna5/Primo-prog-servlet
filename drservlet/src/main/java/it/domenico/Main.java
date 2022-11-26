package it.domenico;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Tomcat tomcat = new Tomcat();

	        tomcat.setPort(8080);

	        Context ctx = (Context) tomcat.addContext("/ciao", new File(".").getAbsolutePath());
	        
	        PrimaServlet primaServlet = new PrimaServlet();
	        
	        Tomcat.addServlet(ctx, "ciao", primaServlet);

	        ctx.addServletMapping("/*", "ciao");

	        try {
				tomcat.start();
			} catch (LifecycleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        tomcat.getServer().await();
	}

}
