package org.mycompany;

import org.springframework.stereotype.Component;

@Component
public class RouteBuilder extends org.apache.camel.builder.RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration().component("servlet");
		
		rest("/order").get().route().setBody(constant("{id:19}"));
	}

}
