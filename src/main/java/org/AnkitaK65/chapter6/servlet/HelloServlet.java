package org.AnkitaK65.chapter6.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * Servlet Running Process:
 *
 * 1. Create a Maven project and add the required dependencies for servlets in the pom.xml file.
 * 2. Implement the servlet class extending HttpServlet and override necessary methods (e.g., doGet, doPost).
 * 3. Configure the servlet mapping in web.xml or use the @WebServlet annotation for URL mapping.
 * 4. Package the application into a .war file using 'mvn clean package'.
 * 5. Deploy the .war file to the Tomcat server's webapps directory and access the servlet via the mapped URL.
 */

// The @WebServlet annotation maps the servlet to a specific URL
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    // Handles GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the content type of the response to text/html
        response.setContentType("text/html");

        // Get the writer object to send the response
        PrintWriter out = response.getWriter();

        // Write the response in HTML format
        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, Welcome to Servlet Programming!</h1>");
        out.println("<p>This is a simple Java Servlet example.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}


/*
 * You can run a servlet for testing without setting up a full-fledged web server like Tomcat,
 * by using tools such as
 * Using Embedded Tomcat
 * Run the HelloServlet without a full server setup by adding the necessary Maven dependencies for Tomcat to your pom.xml.
 * Create a main class (EmbeddedTomcat) to start the embedded server and map the servlet, making it accessible at http://localhost:8080/test/hello.
 */