package com.soap;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient{
	
	public static void main(String[] args) throws Exception {
	   
		URL url = new URL("http://localhost:8080/HelloWorld/hello?wsdl");
        QName qname = new QName("http://soap.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString());
       
    }

}
