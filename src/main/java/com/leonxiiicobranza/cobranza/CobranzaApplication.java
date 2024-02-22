package com.leonxiiicobranza.cobranza;



import java.security.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class CobranzaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		String disabledAlgorithms = Security.getProperty("jdk.tls.disabledAlgorithms");
	//	System.out.print(false);
		Security.setProperty("jdk.tls.disabledAlgorithms", disabledAlgorithms .replace("TLSv1,", ""));
		SpringApplication.run(CobranzaApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(CobranzaApplication.class);
    }

}
