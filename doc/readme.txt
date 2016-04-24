Create a web service (of course).

Create a sun-jaxws.xml, defines web service implementation class.

Create a standard web.xml, defines WSServletContextListener, WSServlet and structure of a web project.

Build tool to generate WAR file.

Copy JAX-WS dependencies to “${Tomcat}/lib” folder.

Copy WAR to “${Tomcat}/webapp” folder.

Start It.
URL: http://localhost:8080/HelloWorld/hello





-----
Dependency Download:
1. https://jax-ws.java.net/
2. Download JAX-WS RI distribution.
3. Unzip it and copy following JAX-WS dependencies to Tomcat library folder “{$TOMCAT}/lib“.