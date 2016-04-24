package com.soap;

import javax.jws.WebService;

//Service Implementation Bean

@WebService(endpointInterface = "com.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}
}