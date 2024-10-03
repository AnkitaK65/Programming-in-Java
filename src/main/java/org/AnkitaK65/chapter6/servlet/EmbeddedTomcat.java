package org.AnkitaK65.chapter6.servlet;

// Import necessary classes
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class EmbeddedTomcat {
    public static void main(String[] args) throws LifecycleException {
        // Create a new instance of Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080); // Set the port number

        // Get the default connector
        tomcat.getConnector();

        // Add a web application with the context path /test
        var context = tomcat.addWebapp("/test", System.getProperty("java.io.tmpdir"));

        // Add the HelloServlet to the context
        tomcat.addServlet(context, "HelloServlet", new HelloServlet());

        // Map the servlet to the /hello URL
        context.addServletMappingDecoded("/hello", "HelloServlet");

        // Start the Tomcat server
        tomcat.start();

        // Wait for incoming requests
        tomcat.getServer().await();
    }
}


// http://localhost:8080/test/hello