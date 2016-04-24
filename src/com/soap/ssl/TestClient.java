package com.soap.ssl;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soap.HelloWorld;

public class TestClient {
	
	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){
 
	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
	
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://localhost:8443/HelloWorld/hello?wsdl");
		QName qname = new QName("http://soap.com/", "HelloWorldImplService");
		Service service = Service.create(url, qname);

		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString());
	}
}
