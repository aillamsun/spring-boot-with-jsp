package com.example.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by sungang on 2017/6/13.
 */
@SpringBootApplication
public class BootJspServer extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootJspServer.class);
    }


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootJspServer.class);

        app.run(args);
    }
}

